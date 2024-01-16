import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    static int total = 0;
    static int answer = Integer.MAX_VALUE;
    static Integer[] dp = new Integer[(1<<20)];

    public static int minimumDifference(int[] nums){
        for(int num : nums){ total += num; }
        findMinimum(nums, 0, 0);
        return answer;
    }

    private static int findMinimum(int[] nums, int index, int sum){
        if(index == nums.length) return sum;

        if(dp[index] != null) return dp[index];

        int add = findMinimum(nums, index+1, sum+nums[index]);
        int notadd = findMinimum(nums, index+1, sum);
        dp[index] = Math.min(add, notadd);

        answer = Math.min(answer, Math.abs((total-sum) - sum));
        return dp[index];
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(minimumDifference(nums));
    }
}

//
public int minDifferencePartition(int[] nums) {
    int totalSum = 0;
    for (int i=0;i<nums.length;i++) {
        totalSum+=nums[i];
    }
    Boolean[][] dp = new Boolean[nums.length][totalSum+1];
    return getDifference(nums, 0, 0, 0, dp, totalSum);
}

private int getDifference(int[] nums, int currentIndex, int sum1, int sum2, Boolean[][] dp, int totalSum) {
    if (currentIndex == nums.length)
        return Math.abs(sum1 - sum2);

    if (dp[currentIndex][sum1] == null) {
        int diff1 = getDifference(nums, currentIndex + 1, sum1 + nums[currentIndex], sum2, dp, totalSum);
        int diff2 = getDifference(nums, currentIndex + 1, sum1, sum2 + nums[currentIndex], dp, totalSum);
        dp[currentIndex][sum1] = Math.min(diff1, diff2);
    }
    return dp[currentIndex][sum1];
}
//

public class Main {
	public static void main(String[] args) {
    	int[] nums = {1,2,3,4,5,6,7,8,9};
    	System.out.println(minimizeDifference(nums));
	}

	public static int minimizeDifference(int[] nums) {
    	int totalSum = 0;
    	for(int num : nums) {
        	totalSum += num;
    	}

    	int[] dp = new int[totalSum / 2 + 1];
    	for(int num : nums) {
        	for(int i = totalSum / 2; i >= num; i--) {
            	dp[i] = Math.max(dp[i], dp[i - num] + num);
        	}
    	}

    	return totalSum - 2 * dp[totalSum / 2];
	}
}
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 100};
        System.out.println(minDifference(nums));
    }

    public static int minDifference(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int[] dp = new int[total / 2 + 1];
        for (int num : nums) {
            for (int j = total / 2; j >= num; j--) {
                dp[j] = Math.max(dp[j], dp[j - num] + num);
            }
        }
        return total - 2 * dp[total / 2];
    }
}

public static int minPartition(int[] nums) {
    int total = 0;
    for (int num : nums) {
        total += num;
    }

    boolean[][] dp = new boolean[nums.length+1][total+1];
    for (int i = 0; i <= nums.length; i++) {
        dp[i][0] = true;
    }

    for (int i = 1; i <= nums.length; i++) {
        for (int j = 1; j <= total; j++) {
            if (j < nums[i-1]) {
                dp[i][j] = dp[i-1][j];
            } else {
                dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
            }
        }
    }

    for (int i = total / 2; i >= 0; i--) {
        if (dp[nums.length][i]) {
            return total - 2 * i;
        }
    }

    return -1;
}
