public class Solution {
	public int findMin(int[] nums) {
    	if (nums.length == 1){
        	return nums[0];
    	}

    	int left = 0, right = nums.length - 1;

    	if (nums[right] > nums[0]){
        	return nums[0];
    	}
   	 
    	while (right >= left) {
        	int mid = left + (right - left) / 2;

        	if (nums[mid] > nums[mid + 1]){
            	return nums[mid + 1];
        	}

        	if (nums[mid - 1] > nums[mid]){
            	return nums[mid];
        	}

        	if (nums[mid] > nums[0]){
            	left = mid + 1;
        	} else {
            	right = mid - 1;
        	}
    	}
    	return -1;
	}
}
public int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] >= nums[left]) {
            if (target >= nums[left] && target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        else {
            if (target <= nums[right] && target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
    return -1;
}
public int findMin(int[] nums) {
    if(nums.length == 1) {
        return nums[0];
    }

    int left = 0;
    int right = nums.length - 1;

    if(nums[right] > nums[0]) {
        return nums[0];
    }

    while(right >= left) {
        int mid = left + (right - left) / 2;

        if(nums[mid] > nums[mid + 1]) {
            return nums[mid + 1];
        }

        if(nums[mid - 1] > nums[mid]) {
            return nums[mid];
        }

        if(nums[mid] > nums[0]) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1;
}

public int findMin(int[] nums) {
    if (nums.length == 1) {
        return nums[0];
    }
    int left = 0, right = nums.length - 1;
    if (nums[right] > nums[0]) {
        return nums[0];
    }
    while (right >= left) {
        int mid = left + (right - left) / 2;
        if (nums[mid] > nums[mid + 1]) {
            return nums[mid + 1];
        }
        if (nums[mid - 1] > nums[mid]) {
            return nums[mid];
        }
        if (nums[mid] > nums[0]) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1;
}

public class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0, right = nums.length - 1;
        if (nums[right] > nums[0]) {
            return nums[0];
        }
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }
            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
