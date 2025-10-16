package ProblemsDay_131;

public class PowerofTwo {

    //https://leetcode.com/problems/power-of-two/
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {

    }
}
