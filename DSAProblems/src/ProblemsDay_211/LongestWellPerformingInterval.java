package ProblemsDay_211;

import java.util.HashMap;
import java.util.Map;

public class LongestWellPerformingInterval {

//https://leetcode.com/problems/longest-well-performing-interval/?envType=problem-list-v2&envId=prefix-sum
    public int longestWPI(int[] hours) {
        int[] transformed = new int[hours.length];
        for (int i = 0; i < hours.length; i++) {
            transformed[i] = (hours[i] > 8) ? 1 : -1;
        }

        int prefixSum = 0;
        int longestInterval = 0;
        Map<Integer, Integer> prefixSumMap = new HashMap<>();

        for (int i = 0; i < transformed.length; i++) {
            // Update the running prefix sum
            prefixSum += transformed[i];

            // If the prefix sum is positive, we have a well-performing interval from the start to i
            if (prefixSum > 0)
                longestInterval = i + 1;
            else
                // Check if there is an earlier prefix sum that would give a well-performing interval
                if (prefixSumMap.containsKey(prefixSum - 1))
                    longestInterval = Math.max(longestInterval, i - prefixSumMap.get(prefixSum - 1));

            // Record the first occurrence of each prefix sum
            if (!prefixSumMap.containsKey(prefixSum))
                prefixSumMap.put(prefixSum, i);
        }

        return longestInterval;
    }
    public static void main(String[] args) {

    }
}
