package ProblemsDay_96;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumStarSumGraph {

    //https://leetcode.com/problems/maximum-star-sum-of-a-graph/

    public int maxStarSum(int[] vals, int[][] edges, int k) {
        int n = vals.length;

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.get(u).add(vals[v]); // add value of v as neighbor of u
            graph.get(v).add(vals[u]); // add value of u as neighbor of v
        }

        int maxSum = Integer.MIN_VALUE;

        // Step 2: Try each node as center of the star
        for (int i = 0; i < n; i++) {
            List<Integer> neighbors = graph.get(i);

            // Use a max-heap to store positive neighbor values
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for (int val : neighbors) {
                if (val > 0) {
                    pq.offer(val);
                }
            }

            // Take up to k largest positive neighbors
            int currentSum = vals[i]; // start with center node's value
            int count = 0;
            while (!pq.isEmpty() && count < k) {
                currentSum += pq.poll();
                count++;
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;

    }

    public static void main(String[] args) {

    }
}
