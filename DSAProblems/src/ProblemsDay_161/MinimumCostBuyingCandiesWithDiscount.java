package ProblemsDay_161;

import java.util.Arrays;

public class MinimumCostBuyingCandiesWithDiscount {

    //https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/
    public int minimumCost(int[] A) {
        Arrays.sort(A);
        int res = 0, n = A.length;
        for (int i = 0; i < n; ++i)
            if (i % 3 != n % 3)
                res += A[i];
        return res;
    }
    public static void main(String[] args) {

    }
}
