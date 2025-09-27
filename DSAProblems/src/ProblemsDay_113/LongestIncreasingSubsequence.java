package ProblemsDay_113;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

    //https://leetcode.com/problems/longest-increasing-subsequence/?envType=study-plan-v2&envId=dynamic-programming

    public int lengthOfLIS(int[] nums) {

        List<Integer> tails = new ArrayList<>();

        for (int num : nums) {
            int left = 0, right = tails.size();

            // Binary search to find the insertion point
            while (left < right) {
                int mid = (left + right) / 2;
                if (tails.get(mid) < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            if (left == tails.size()) {
                // New largest number, extend the sequence
                tails.add(num);
            } else {
                // Replace to maintain the smallest possible tail
                tails.set(left, num);
            }
        }

        return tails.size();
    }

    public static void main(String[] args) {

    }
}
