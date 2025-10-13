package ProblemsDay_128;

public class FindMinimumAmountTimeBrewPotions {

    //https://leetcode.com/problems/find-the-minimum-amount-of-time-to-brew-potions/?envType=daily-question&envId=2025-10-13
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length, m = mana.length;
        long[] done = new long[n + 1];

        for (int j = 0; j < m; ++j) {
            for (int i = 0; i < n; ++i) {
                done[i + 1] = Math.max(done[i + 1], done[i]) + (long) mana[j] * skill[i];
            }
            for (int i = n - 1; i > 0; --i) {
                done[i] = done[i + 1] - (long) mana[j] * skill[i];
            }
        }

        return done[n];
    }

    public static void main(String[] args) {

    }
}
