public class MergeSortImplementation {
    
    // public void merge(int[] a, int beg, int beg, int end) {

    // }
    
    public static void merge (int[] arr, int[] aux, int left, int mid ,int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        while (k <= right) {
            if (i > mid) {
                aux[k] = arr[j];
                j++;
            } else if (j > right){
                aux[k] = arr[i];
                i++;
            } else if (arr[i] > arr[j]) {
                aux[k] = arr[j];
                j++;
            } else {
                aux[k] = arr[i];
                i++;
            }
            k++;

            
        }

        for (k = left; k <= right; k++) {
                arr[k] = aux[k];
        }
    }
    
    public static void mergeSort(int[] arr) {
        int[] aux = new int[arr.length];
        mergeSort(arr,aux,0, arr.length -1);
    }

    
    private  static void mergeSort(int[] arr, int[] aux, 
        int  left, int right)  {
        if (left >= right) {
            return;
        }
       
       int mid = left + (right - left ) / 2;
       mergeSort(arr, aux, left, mid);
       mergeSort(arr, aux, mid+ 1, right);

       merge(arr, aux,left, mid,right);
        
    }

    
    
    
    public static void main (String[] args) {
        int[] exemplo = {5, 4,3,2,1};
        mergeSort(exemplo);
        for (int x: exemplo) {
            System.out.println(x);
        }
    } 
}