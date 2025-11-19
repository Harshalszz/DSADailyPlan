package ProblemsDay_164;

public class GlobalandLocalInversions {

    //https://leetcode.com/problems/global-and-local-inversions/?envType=problem-list-v2&envId=array
    public boolean isIdealPermutation(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i] - i) > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
