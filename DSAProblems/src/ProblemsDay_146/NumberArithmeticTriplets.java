package ProblemsDay_146;

public class NumberArithmeticTriplets {

    //https://leetcode.com/problems/number-of-arithmetic-triplets/?envType=problem-list-v2&envId=two-pointers
    public int arithmeticTriplets(int[] nums, int diff) {
        boolean[] check = new boolean[201];
        int ans = 0;
        for (int i : nums) {
            if (i >= 2 * diff && check[i - diff] && check[i - 2 * diff]) {
                ans++;
            }
            check[i] = true;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
