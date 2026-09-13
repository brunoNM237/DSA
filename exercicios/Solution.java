class Solution {
    
    static int numberOfDigits(int num) {
        int digits = 0; 
        do { 
            num = num / 10; 
            digits++;   
        }while (num / 10 != 0);

        return digits; 
    }
    
    public int findNumbers(int[] nums) {
        int numberOfDigitsEven = 0; 
        for (int num: nums) {
            if (numberOfDigits(num) % 2 == 0) {
                numberOfDigitsEven++;
            }
        }    
        return numberOfDigitsEven; 
    }
}