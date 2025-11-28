package ProblemsDay_173;

public class MaximumRepeatingSubstring {

    //https://leetcode.com/problems/maximum-repeating-substring/?envType=problem-list-v2&envId=string-matching
    public int maxRepeating(String sequence, String word) {
        int n = sequence.length();
        int m = word.length();
        int[] dp = new int[n + 1];
        int maxRepeat = 0;

        for (int i = m; i <= n; i++) {
            if (sequence.substring(i - m, i).equals(word)) {
                dp[i] = dp[i - m] + 1;
                maxRepeat = Math.max(maxRepeat, dp[i]);
            }
        }

        return maxRepeat;
    }
    public static void main(String[] args) {

    }
}
