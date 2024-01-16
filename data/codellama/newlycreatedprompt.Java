import java.util.Arrays;

public class PartitionArray {
    public int partitionArray(int[] nums) {
        int n = nums.length;
        int[] sums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];
        }
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j < i; j++) {
                dp[i] = Math.min(dp[i], Math.abs(sums[j] - (sums[i] - sums[j])));
            }
        }
        return dp[n];
    }
}
import java.util.Arrays;

public class PartitionArray {
    public static int partitionArray(int[] nums) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < sortedNums.length; i++) {
            if (i % 2 == 0) {
                sum1 += sortedNums[i];
            } else {
                sum2 += sortedNums[i];
            }
        }
        return Math.abs(sum1 - sum2);
    }
}
import java.util.Arrays;

public class PartitionArray {
	public int partitionArray(int[] nums) {
    	int n = nums.length;
    	int[] sums = new int[n + 1];
    	for (int i = 1; i <= n; i++) {
        	sums[i] = sums[i - 1] + nums[i - 1];
    	}
    	int[] dp = new int[n + 1];
    	for (int i = 1; i <= n; i++) {
        	dp[i] = Integer.MAX_VALUE;
        	for (int j = 1; j < i; j++) {
            	dp[i] = Math.min(dp[i], Math.abs(sums[j] - sums[i]));
        	}
    	}
    	return dp[n];
	}
}

public class MinimumPartition {
    public int minimumPartition(int[] nums) {
        int n = nums.length;
        int[] sum = new int[1 << n];
        for (int i = 0; i < (1 << n); i++) {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    sum[i] += nums[j];
                }
            }
        }
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < (1 << (n - 1)); i++) {
            int diff = Math.abs(sum[i] - sum[(1 << n) - i]);
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
}

import java.util.Arrays;
public class PartitionArray {
public int partitionArray(int[] nums) {
int n = nums.length;
int[] sums = new int[n + 1];
for (int i = 1; i <= n; i++) {
sums[i] = sums[i - 1] + nums[i - 1];
}
int[] dp = new int[n + 1];
for (int i = 1; i <= n; i++) {
dp[i] = Integer.MAX_VALUE;
for (int j = 1; j < i; j++) {
dp[i] = Math.min(dp[i], Math.abs(sums[j] - (sums[i] - sums[j])));
}
}
return dp[n];
}
}