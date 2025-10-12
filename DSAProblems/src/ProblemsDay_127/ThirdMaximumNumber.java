package ProblemsDay_127;

public class ThirdMaximumNumber {
    //https://leetcode.com/problems/third-maximum-number/?envType=problem-list-v2&envId=sorting

    public int thirdMax(int[] nums) {
        // Use Long to handle Integer.MIN_VALUE safely
        Long max1 = null, max2 = null, max3 = null;

        for (int n : nums) {
            if ((max1 != null && n == max1) ||
                    (max2 != null && n == max2) ||
                    (max3 != null && n == max3)) {
                continue; // Skip duplicates
            }

            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = (long) n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = (long) n;
            } else if (max3 == null || n > max3) {
                max3 = (long) n;
            }
        }

        return max3 == null ? max1.intValue() : max3.intValue();
    }

    public static void main(String[] args) {

    }
}
