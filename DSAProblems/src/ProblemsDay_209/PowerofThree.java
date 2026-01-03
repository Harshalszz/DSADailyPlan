package ProblemsDay_209;

public class PowerofThree {


    //https://leetcode.com/problems/power-of-three/?envType=problem-list-v2&envId=recursion
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {

    }
}
