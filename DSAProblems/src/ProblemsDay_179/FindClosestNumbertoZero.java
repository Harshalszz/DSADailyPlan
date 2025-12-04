package ProblemsDay_179;

public class FindClosestNumbertoZero {

    //https://leetcode.com/problems/find-closest-number-to-zero/
    public int findClosestNumber(int[] nums) {
        int closest = 0;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int absValue = Math.abs(nums[i]);

            if (absValue < minDistance || (absValue == minDistance && absValue > closest)) {
                closest = nums[i];
                minDistance = absValue;
            }
        }

        return closest;
    }

    public static void main(String[] args) {

    }
}
