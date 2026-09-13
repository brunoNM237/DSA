import java.util.Random;



public class QuickSortImplementation {
  

    static void swap(int[] arr, int i, int j ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low;
        int j = high -1;
    
        while (i <= j) {
            if (array[i] < pivot) {
                i++;
            } else if (array[j] >= pivot) {
                j--;
            } else {
                swap(array, i , j);
                i++;
                j--;

            }
        }
        
       swap(array, i, high); 

        return i;
    }   

    private static final Random random = new Random();
  
    public static void quicksort(int[] array, int low , int high) {
        
        if(low < high) {
            
            int randomIndex = random.nextInt(high - low + 1) + low; 
            swap(array,randomIndex, high);

            int p = partition (array, low, high);
            quicksort(array, low, p -1);
            quicksort(array, p +  1 , high);
        }
    }
    

    public static void main (String[] args) {
        //
    }
}