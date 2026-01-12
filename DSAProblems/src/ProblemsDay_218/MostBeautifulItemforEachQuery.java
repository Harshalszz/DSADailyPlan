package ProblemsDay_218;

import java.util.Arrays;
import java.util.Comparator;

public class MostBeautifulItemforEachQuery {

    //https://leetcode.com/problems/most-beautiful-item-for-each-query/?envType=problem-list-v2&envId=binary-search
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, Comparator.comparingInt(a -> a[0]));

        // Step 2: Sort queries with their original indices
        int[][] queriesWithIndex = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            queriesWithIndex[i][0] = queries[i];
            queriesWithIndex[i][1] = i;
        }
        Arrays.sort(queriesWithIndex, Comparator.comparingInt(a -> a[0]));

        int[] result = new int[queries.length];
        int maxBeauty = 0;
        int i = 0;

        for (int[] queryWithIndex : queriesWithIndex) {
            int query = queryWithIndex[0];
            int index = queryWithIndex[1];

            // Move through items that are within the current query's price range
            while (i < items.length && items[i][0] <= query) {
                maxBeauty = Math.max(maxBeauty, items[i][1]);
                i++;
            }

            // Store the max beauty for this query
            result[index] = maxBeauty;
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
