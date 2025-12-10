package ProblemsDay_185;

public class SingleNumberII {
//https://leetcode.com/problems/single-number-ii/?envType=problem-list-v2&envId=array
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
    public static void main(String[] args) {

    }
}
