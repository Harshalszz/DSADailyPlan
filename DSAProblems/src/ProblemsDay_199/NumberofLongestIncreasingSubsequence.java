package ProblemsDay_199;

public class NumberofLongestIncreasingSubsequence {
//https://leetcode.com/problems/number-of-longest-increasing-subsequence/?envType=problem-list-v2&envId=array
    public int findNumberOfLIS(int[] nums) {
        int[] DP = new int[nums.length];
        DP[0] = 1;
        int[] count = new int[nums.length];
        count[0] = 1;

        int globalLen = 1;
        int globalCount = 1;

        for (int i = 1; i < nums.length; i++) {
            DP[i] = 1;
            count[i] = 1; // nums[i] itself

            // update DP[i], count[i]
            for (int j = 0; j < i; j++) {
                if (nums[j] >= nums[i]) continue;

                if (DP[j] + 1 == DP[i]) {
                    count[i] += count[j];
                }

                else if (DP[j] + 1 > DP[i]) {
                    DP[i] = DP[j] + 1;
                    count[i] = count[j];
                }
            }

            // update global result
            if (DP[i] == globalLen) {
                globalCount += count[i];
            }

            else if (DP[i] > globalLen) {
                globalLen = DP[i];
                globalCount = count[i];
            }
        }

        return globalCount;
    }
    public static void main(String[] args) {

    }
}
