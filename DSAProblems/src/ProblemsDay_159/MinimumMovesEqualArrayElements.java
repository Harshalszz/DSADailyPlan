package ProblemsDay_159;

public class MinimumMovesEqualArrayElements {

    //https://leetcode.com/problems/minimum-moves-to-equal-array-elements/?envType=problem-list-v2&envId=array
    public int minMoves(int[] nums) {
        int sum = 0, min = nums[0];
        for (int n : nums) {
            sum += n;
            if (n < min) min = n;
        }
        return sum - nums.length * min;
    }
    public static void main(String[] args) {

    }
}
