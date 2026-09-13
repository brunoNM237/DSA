public class BinarySearchQuestions {
   public static int ceiling (int[] array, int left, int right, int target) {
        

        int mid; 
        int candidate = -1;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (array[mid] == target) return target; 
            else if (array[mid] > target) {
                if (candidate == -1 || candidate > array[mid]) {
                    candidate = array[mid];                
                }
                right = mid -1;         
            } else {
                left = mid + 1; 
            

            }

        }
        return  candidate;

        
   }

   // public class int ceiling2(int[] array)

   public static void main (String[] args) {
        int[] arr = {2,3,5,9,14,16};
        System.out.println(ceiling(arr, 0, arr.length -1 , 15));
   }
}
