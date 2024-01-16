public int findMin(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
        int mid = (left + right) / 2;
        if (nums[mid] > nums[right]) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return nums[left];
}
public static int findRotationPoint(int[] nums) {
    int start = 0;
    int end = nums.length - 1;
    while (start < end) {
        int mid = (start + end) / 2;
        if (nums[mid] > nums[mid + 1]) {
            return mid + 1;
        }
        if (nums[mid] < nums[start]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return start;
}
public int findMin(int[] nums) {
	int left = 0;
	int right = nums.length - 1;
	while (left < right) {
    	int mid = (left + right) / 2;
    	if (nums[mid] < nums[right]) {
        	right = mid;
    	} else {
        	left = mid + 1;
    	}
	}
	return nums[left];
}

public int findMin(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
        int mid = (left + right) / 2;
        if (nums[mid] < nums[right]) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return nums[left];
}

public int findMin(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
        int mid = (left + right) / 2;
        if (nums[mid] < nums[right]) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return nums[left];
}
