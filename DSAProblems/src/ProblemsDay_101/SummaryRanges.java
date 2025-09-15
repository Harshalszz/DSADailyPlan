package ProblemsDay_101;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    //https://leetcode.com/problems/summary-ranges/?envType=study-plan-v2&envId=top-interview-150

    public List<String> summaryRanges(int[] nums) {

        List<String> res = new ArrayList<>();

        if (nums == null || nums.length == 0)
            return res;

        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Check for break in sequence
            if (nums[i] != nums[i - 1] + 1) {
                // Add range or single number
                if (start == nums[i - 1]) {
                    res.add(String.valueOf(start));
                } else {
                    res.add(start + "->" + nums[i - 1]);
                }
                // Update start for new range
                start = nums[i];
            }
        }

        // Handle the last range
        if (start == nums[nums.length - 1]) {
            res.add(String.valueOf(start));
        } else {
            res.add(start + "->" + nums[nums.length - 1]);
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
