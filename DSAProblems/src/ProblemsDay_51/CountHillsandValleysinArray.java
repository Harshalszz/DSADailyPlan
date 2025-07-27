package ProblemsDay_51;

public class CountHillsandValleysinArray {
    //https://leetcode.com/problems/count-hills-and-valleys-in-an-array/description/?envType=daily-question&envId=2025-07-27

    public static int countHillValley(int[] nums) {

        int lastN = nums[0];
        int count = 0;

        for (int j = 1; j < nums.length - 1; j++) {

            if ((lastN < nums[j] && nums[j] > nums[j + 1]) || (lastN > nums[j] && nums[j] < nums[j + 1])) {
                count++;
                lastN= nums[j];

            }


        }

        return count;

    }

    public static void main(String[] args) {

        int[] nums = {2,4,1,1,6,5};
        System.out.println(countHillValley(nums));

    }
}
