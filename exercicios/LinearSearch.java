    
public class LinearSearch {
    static boolean linearSearchString(String str, char target) {
        if (str.length() == 0) {
            return false;
        } 

        for(int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true; 
            }
        }

        return false;
    }
 
    static boolean search2DArray(int[][] arr, int target) {
       for (int i = 0; i < arr.length; i++) {
        for (int j = 0; i < arr[i].length; j++) {
            if (arr[i][j] == target) {
                return true;
            }
        }
       } 
       return false; 
    }





}