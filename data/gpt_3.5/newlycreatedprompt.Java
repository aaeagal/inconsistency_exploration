public class PartitionedArray {
    public static int findMinDifference(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        return findMinDifferenceHelper(nums, 0, 0, totalSum);
    }
    
    public static int findMinDifferenceHelper(int[] nums, int index, int subsetSum, int totalSum) {
        if (index == nums.length) {
            return Math.abs(totalSum - 2 * subsetSum);
        }
        
        int diff1 = findMinDifferenceHelper(nums, index + 1, subsetSum + nums[index], totalSum);
        int diff2 = findMinDifferenceHelper(nums, index + 1, subsetSum, totalSum);
        
        return Math.min(diff1, diff2);
    }
}

import java.util.Arrays;

public class PartitionArray {
    public static int minimizeDifference(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int subsetSum = totalSum / 2;
        
        int[][] dp = new int[nums.length + 1][subsetSum + 1];
        
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 0; j <= subsetSum; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (nums[i - 1] <= j) {
                    dp[i][j] = Math.max(nums[i - 1] + dp[i - 1][j - nums[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        return totalSum - 2 * dp[nums.length][subsetSum];
    }

    public static void main(String[] args) {
        int[] nums = {1, 6, 11, 5};
        System.out.println("Minimum difference: " + minimizeDifference(nums));
    }
}

public class MinimumDifferencePartition {
	static int minDiff = Integer.MAX_VALUE;
    
	public static int partitionArray(int[] nums) {
    	int totalSum = 0;
    	for (int num : nums) {
        	totalSum += num;
    	}
   	 
    	helper(nums, 0, 0, totalSum);
   	 
    	return minDiff;
	}
    
	public static void helper(int[] nums, int index, int currentSum, int totalSum) {
    	if (index == nums.length) {
        	int remainingSum = totalSum - currentSum;
        	int diff = Math.abs(currentSum - remainingSum);
        	minDiff = Math.min(minDiff, diff);
    	} else {
        	helper(nums, index + 1, currentSum + nums[index], totalSum);
        	helper(nums, index + 1, currentSum, totalSum);
    	}
	}
}


import java.util.Arrays;

public class PartitionSubset {
    
    public static int minDifference(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int n = nums.length;
        int targetSum = totalSum / 2;
        
        Boolean[][] dp = new Boolean[n + 1][targetSum + 1];
        
        return helper(nums, n, targetSum, dp);
    }
    
    private static int helper(int[] nums, int n, int target, Boolean[][] dp) {
        if (target == 0) {
            return 0;
        }
        
        if (n == 0 || target < 0) {
            return Integer.MAX_VALUE;
        }
        
        if (dp[n][target] != null) {
            return dp[n][target];
        }
        
        int included = helper(nums, n - 1, target - nums[n - 1], dp);
        int excluded = helper(nums, n - 1, target, dp);
        
        int minDifference = Math.min(included, excluded);
        dp[n][target] = minDifference;
        
        return dp[n][target];
    }

    public static void main(String[] args) {
        int[] nums = {1, 6, 11, 5};
        int minDifference = minDifference(nums);
        System.out.println("Minimum difference: " + minDifference);
    }
}

import java.util.Arrays;

public class PartitionedArray {
    public static int minDifference(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        
        for (int num : nums) {
            totalSum += num;
        }
        
        int[][] dp = new int[n/2 + 1][totalSum + 1];
        
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return minDiff(nums, 0, 0, totalSum, dp);
    }
    
    public static int minDiff(int[] nums, int idx, int sum1, int sum2, int[][] dp) {
        if (idx == nums.length) {
            return Math.abs(sum1 - sum2);
        }
        
        if (dp[idx][sum1] != -1) {
            return dp[idx][sum1];
        }
        
        int diff1 = minDiff(nums, idx + 1, sum1 + nums[idx], sum2, dp);
        int diff2 = minDiff(nums, idx + 1, sum1, sum2 + nums[idx], dp);
        
        dp[idx][sum1] = Math.min(diff1, diff2);
        
        return dp[idx][sum1];
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int minDiff = minDifference(nums);
        
        System.out.println("Minimum difference: " + minDiff);
    }
}
