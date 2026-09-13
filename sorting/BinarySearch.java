public class BinarySearch {
 
    //recursivo
    public static int BinarySearchImplementation(int[] array, int left, int right, int ele){
            
            if (left > right) {
                return -1;
            } 

            int mid = left + (right - left) / 2; 

            //três casos: exatamente no meio, na esquerda, na direita 
            if (array[mid] == ele ) {
                return mid;
            } else if (array[mid] > ele) {
                return BinarySearchImplementation(array, left, mid - 1, ele);
            } else {
                return BinarySearchImplementation(array, mid + 1, right, ele);
            }

    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
    
        int index = BinarySearchImplementation(arr, 0, arr.length - 1, 40);
        System.out.println("Index: " + index);        // Output: Index: 3
        System.out.println("Value: " + arr[index]);   // Output: Value: 40
        
        // Test with element not found
        int notFound = BinarySearchImplementation(arr, 0, arr.length - 1, 100);
        System.out.println("Not found: " + notFound); // Output: Not found: -1
    }
}
