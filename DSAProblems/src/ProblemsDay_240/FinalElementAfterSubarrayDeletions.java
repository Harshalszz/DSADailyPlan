package ProblemsDay_240;

public class FinalElementAfterSubarrayDeletions {

    //https://leetcode.com/problems/final-element-after-subarray-deletions/
    public int finalElement(int[] nums) {
        return Math.max(nums[0], nums[nums.length - 1]);
    }
    public static void main(String[] args) {

    }
}
