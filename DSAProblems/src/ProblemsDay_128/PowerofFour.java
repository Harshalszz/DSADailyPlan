package ProblemsDay_128;

public class PowerofFour {

    //https://leetcode.com/problems/power-of-four/?envType=daily-question&envId=2025-10-13

    public boolean isPowerOfFour(int n) {

        if (n <= 0) return false;
        while (n % 4 == 0) n /= 4;
        return n == 1;


    }

    public static void main(String[] args) {

    }
}
