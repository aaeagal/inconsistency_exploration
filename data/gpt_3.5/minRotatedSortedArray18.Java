public class RotatedArraySearch {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}

public class RotatedArray {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
    
        while (left < right) {
            int mid = left + (right - left) / 2;
    
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
    
        return nums[left];
    }
    
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int min = findMin(nums);
        System.out.println("Minimum element: " + min);
    }
}

public class RotatedArraySearch {

	public static int search(int[] nums, int target) {
    	int left = 0;
    	int right = nums.length - 1;

    	while (left <= right) {
        	int mid = left + (right - left) / 2;

        	if (nums[mid] == target) {
            	return mid;
        	} else if (nums[left] <= nums[mid]) {
            	if (target >= nums[left] && target < nums[mid]) {
                	right = mid - 1;
            	} else {
                	left = mid + 1;
            	}
        	} else {
            	if (target > nums[mid] && target <= nums[right]) {
                	left = mid + 1;
            	} else {
                	right = mid - 1;
            	}
        	}
    	}

    	return -1;
	}

	public static void main(String[] args) {
    	int[] nums = {4, 5, 6, 7, 0, 1, 2};
    	int target = 0;
    	int index = search(nums, target);
    	System.out.println("Index of target: " + index);
	}
}
public class RotatedArray {
  
    public static int findMin(int[] nums) {
      int left = 0;
      int right = nums.length - 1;
      
      while (left < right) {
        int mid = left + (right - left) / 2;
        
        if (nums[mid] > nums[right]) {
          left = mid + 1;
        } else {
          right = mid;
        }
      }
      
      return nums[left];
    }
    
    public static void main(String[] args) {
      int[] nums = {4, 5, 6, 7, 0, 1, 2};
      int min = findMin(nums);
      System.out.println(min);
    }
  }

  public class RotatedArray {

    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int min = findMin(nums);
        System.out.println("The minimum element in the rotated array is: " + min);
    }
}
