package ProblemsDay_199;

import java.util.Arrays;

public class PartitiontoKEqualSumSubsets {
//https://leetcode.com/problems/partition-to-k-equal-sum-subsets/?envType=problem-list-v2&envId=array
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int total = 0;
        for (int num : nums) total += num;
        if (total % k != 0) return false;

        int target = total / k;
        Arrays.sort(nums); // Sort for early pruning
        int n = nums.length;
        if (nums[n - 1] > target) return false; // largest number cannot exceed target

        boolean[] visited = new boolean[n];
        return backtrack(nums, visited, k, 0, 0, target);
    }

    private boolean backtrack(int[] nums, boolean[] visited, int k, int start, int currSum, int target) {
        if (k == 1) return true; // Remaining nums form the last group
        if (currSum == target) // One group formed, continue with next
            return backtrack(nums, visited, k - 1, 0, 0, target);

        for (int i = start; i < nums.length; i++) {
            if (visited[i]) continue;
            if (currSum + nums[i] > target) continue;

            visited[i] = true;
            if (backtrack(nums, visited, k, i + 1, currSum + nums[i], target))
                return true;
            visited[i] = false;

            // Optimization: if currSum is 0, and first number fails, no need to try others at this level
            if (currSum == 0) break;

            // Optimization: if same number as previous and previous was skipped, skip this too
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
