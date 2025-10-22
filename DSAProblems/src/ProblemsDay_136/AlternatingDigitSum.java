package ProblemsDay_136;

public class AlternatingDigitSum {

    //https://leetcode.com/problems/alternating-digit-sum/
    public int alternateDigitSum(int n) {
        n = reverse(n);
        int ans = 0;
        boolean significant = true;
        while (n > 0) {
            int last = n % 10;
            if (significant) {
                ans += last;
                significant = !significant;
            } else {
                ans -= last;
                significant = !significant;
            }
            n /= 10;
        }
        return ans;
    }

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {

    }
}
