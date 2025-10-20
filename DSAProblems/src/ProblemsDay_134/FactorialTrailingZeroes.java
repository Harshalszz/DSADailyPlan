package ProblemsDay_134;

public class FactorialTrailingZeroes {

    //https://leetcode.com/problems/factorial-trailing-zeroes/?envType=problem-list-v2&envId=math
    public int trailingZeroes(int n) {
        int res = 0;
        while (n > 0) {
            n /= 5;
            res += n;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
