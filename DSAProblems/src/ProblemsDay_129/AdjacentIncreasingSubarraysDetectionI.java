package ProblemsDay_129;

import java.util.List;

public class AdjacentIncreasingSubarraysDetectionI {

    //https://leetcode.com/problems/adjacent-increasing-subarrays-detection-i/?envType=daily-question&envId=2025-10-14

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int increasing = 1;
        int prevIncreasing = 0;

        for (int i = 1; i < nums.size(); ++i) {
            if (nums.get(i) > nums.get(i - 1)) {
                ++increasing;
            } else {
                prevIncreasing = increasing;
                increasing = 1;
            }
            if (increasing / 2 >= k || Math.min(prevIncreasing, increasing) >= k)
                return true;
        }

        return false;
    }
    public static void main(String[] args) {

    }
}
