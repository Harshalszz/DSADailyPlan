package ProblemsDay_151;

public class LargestNumberAtLeastTwiceOthers {

    //https://leetcode.com/problems/largest-number-at-least-twice-of-others/?envType=problem-list-v2&envId=sorting
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (maxIndex != i && nums[maxIndex] < nums[i] * 2) {
                return -1;
            }
        }

        return maxIndex;
    }
    public static void main(String[] args) {

    }
}
