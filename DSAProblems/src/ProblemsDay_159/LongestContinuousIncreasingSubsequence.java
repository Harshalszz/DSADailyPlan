package ProblemsDay_159;

public class LongestContinuousIncreasingSubsequence {
//https://leetcode.com/problems/longest-continuous-increasing-subsequence/?envType=problem-list-v2&envId=array
    public int findLengthOfLCIS(int[] nums) {
        int maxcount = 1;
        int i = 0;
        int count = 1;
        while (i < nums.length - 1) {
            if (nums[i] < nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            maxcount = Math.max(count, maxcount);
            i++;
        }
        return maxcount;
    }
    public static void main(String[] args) {

    }
}
