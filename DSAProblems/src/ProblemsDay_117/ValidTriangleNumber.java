package ProblemsDay_117;

import java.util.Arrays;

public class ValidTriangleNumber {

    //https://leetcode.com/problems/valid-triangle-number/?envType=study-plan-v2&envId=binary-search

    public int triangleNumber(int[] nums) {

        Arrays.sort(nums);
        int totalTriangles = 0;

        // Fix the largest side
        for (int longest = nums.length - 1; longest >= 2; longest--) {
            int left = 0;
            int right = longest - 1;

            while (left < right) {
                if (nums[left] + nums[right] > nums[longest]) {
                    // all pairs between left..right-1 with right are valid
                    totalTriangles += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }
        return totalTriangles;

    }

    public static void main(String[] args) {

    }
}
