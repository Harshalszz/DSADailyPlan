package ProblemsDay_128;

public class ZeroArrayTransformationI {

    //https://leetcode.com/problems/zero-array-transformation-i/?envType=daily-question&envId=2025-10-13
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];

        for (int[] q : queries) {
            diff[q[0]]++;
            if (q[1] + 1 < diff.length) {
                diff[q[1] + 1]--;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diff[i];
            if (nums[i] <= sum) {
                nums[i] = 0;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
