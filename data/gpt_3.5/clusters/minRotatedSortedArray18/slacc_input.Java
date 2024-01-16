public class Solution {
    public static int search(int[] nums, int target) {
        int start = 0; // 1
        int end = nums.length - 1; // 2

        while (start <= end) { // 3
            int mid = start + (end - start) / 2; // 4

            if (nums[mid] == target) { // 5
                return mid;
            }

            if (nums[start] <= nums[mid]) { // 6
                if (target >= nums[start] && target < nums[mid]) { // 7
                    end = mid - 1; // 8
                } else { // 9
                    start = mid + 1; // 10
                }
            } else { // 11
                if (target > nums[mid] && target <= nums[end]) { // 12
                    start = mid + 1; // 13
                } else { // 14
                    end = mid - 1; // 15
                }
            }
        }

        return -1;
    }

    public static int findMin(int[] nums) {
        int left = 0; // 16
        int right = nums.length - 1; // 17

        while (left < right) { // 18
            int mid = left + (right - left) / 2; // 19

            if (nums[mid] > nums[right]) { // 20
                left = mid + 1; // 21
            } else { // 22
                right = mid; // 23
            }
        }

        return nums[left];
    }

	public static int search2(int[] nums, int target) {
    	int left = 0; // 24
    	int right = nums.length - 1; // 25

    	while (left <= right) { // 26
        	int mid = left + (right - left) / 2; // 27

        	if (nums[mid] == target) { // 28
            	return mid;
        	} else if (nums[left] <= nums[mid]) { // 29
            	if (target >= nums[left] && target < nums[mid]) { // 30
                	right = mid - 1; // 31
            	} else { // 32
                	left = mid + 1; // 33
            	}
        	} else { // 34
            	if (target > nums[mid] && target <= nums[right]) { // 35
                	left = mid + 1; // 36
            	} else { // 37
                	right = mid - 1; // 38
            	}
        	}
    	}

    	return -1;
	}

    public static int findMin4(int[] nums) {
      int left = 0; // 39
      int right = nums.length - 1; // 40

      while (left < right) { // 41
        int mid = left + (right - left) / 2; // 42

        if (nums[mid] > nums[right]) { // 43
          left = mid + 1; // 44
        } else { // 45
          right = mid; // 46
        }
      }

      return nums[left];
    }

    public static int findMin7(int[] nums) {
        int left = 0, right = nums.length - 1; // 47

        while (left < right) { // 48
            int mid = left + (right - left) / 2; // 49

            if (nums[mid] > nums[right]) { // 50
                left = mid + 1; // 51
            }
            else { // 52
                right = mid; // 53
            }
        }

        return nums[left];
    }

}
