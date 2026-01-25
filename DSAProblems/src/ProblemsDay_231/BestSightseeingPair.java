package ProblemsDay_231;

public class BestSightseeingPair {

    //https://leetcode.com/problems/best-sightseeing-pair/?envType=problem-list-v2&envId=array
    public int maxScoreSightseeingPair(int[] values) {
        int ans = Integer.MIN_VALUE;
        int m = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] - i + m > ans)
                ans = values[i] - i + m;

            if (values[i] + i > m)
                m = values[i] + i;
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
