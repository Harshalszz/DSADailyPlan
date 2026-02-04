package ProblemsDay_241;

public class MinimumDeletionsMakeStringBalanced {
// https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/?envType=problem-list-v2&envId=string
    public int minimumDeletions(String s) {
        int n = s.length();
        int[] f = new int[n + 1];
        int b = 0;
        for (int i = 1; i <= n; ++i) {
            if (s.charAt(i - 1) == 'b') {
                f[i] = f[i - 1];
                ++b;
            } else {
                f[i] = Math.min(f[i - 1] + 1, b);
            }
        }
        return f[n];
    }
    public static void main(String[] args) {

    }
}
