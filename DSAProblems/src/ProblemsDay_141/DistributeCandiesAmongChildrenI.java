package ProblemsDay_141;

public class DistributeCandiesAmongChildrenI {

//https://leetcode.com/problems/distribute-candies-among-children-i/?envType=problem-list-v2&envId=combinatorics
    public int distributeCandies(int n, int limit) {
        int cnt = 0 , minCh1 = Math.max(0 , n - 2 * limit);
        int maxCh1 = Math.min(n , limit);

        for (int i = minCh1; i <= maxCh1; i++) {
            int rem = n - i;
            int minCh2 = Math.max(0 , rem - limit);
            int maxCh2 = Math.min(limit , rem);

            cnt += maxCh2 - minCh2 + 1;
        }
        return cnt;
    }
    public static void main(String[] args) {

    }
}
