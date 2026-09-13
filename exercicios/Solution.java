//Find First and Last position of Element in Sorted Array


class Main {
    public static int[]  searchRange(int[] num, int target, int left, int right) {
        int[] result = {-1, -1};

        while (left <= right ) {
            int mid = left + (right - left) / 2; 

            if (num[mid] == target) {
                if (result[0] == -1 && result[1] == -1) {
                    result[0] = mid;
                    result[1] = mid;
                }
                int i = mid -1 ; 
                int j = mid + 1 ;
                while (i >=0 && num[i] == target) {
                    
                    
                    result[0] = i;
                    i--;
                }
                while ( j < num.length  && num[j] == target) {
                    
                    
                    result[1] = j;
                    j++;
                }
                return result;
            } else if (num[mid] > target) {
                right = mid -1; 
            } else {
                left = mid + 1; 
            }
        }
        return result;   
    }

    public static int[] binarySearch(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            int[] result = {mid, mid};
            int right1 = mid -1
            int left1 = left
            int right2 = right
            int left2 = vmid + 1;


            while (left1 <= right1) {
                
                int mid1 = left1 + (right1 - left1) / 2;

                if (nums[mid1] == target) {
                    return mid;
                }

                if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
             while (left <= right1) {
                int left2 = mid + 1;
                int mid2 = left2 + (right - left2) / 2;

                if (nums[mid2] == target) {
                    return mid;
                }

                if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return result
        }

        if (nums[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return {-1,-1};
}

   public static void main(String[] args) {

    int[] nums = {5, 7, 7, 8, 8, 10};

    
    int[] result4= searchRange(nums, 5, 0, nums.length - 1);   // expected [0, 0] 

   
    System.out.println("10: [" + result4[0] + ", " + result4[1] + "] Expected [5, 5]");
}

}