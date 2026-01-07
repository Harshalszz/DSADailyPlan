package ProblemsDay_213;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MostStonesRemovedwithSameRowColumn {

//https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/?envType=problem-list-v2&envId=depth-first-search
    private void dfs(int node, List<List<Integer>> adj, Set<Integer> visited) {
        visited.add(node);
        for (int neighbor : adj.get(node)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, adj, visited);
            }
        }
    }

    public int removeStones(int[][] stones) {
        int n = stones.length;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build the graph
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        Set<Integer> visited = new HashSet<>();
        int numComponents = 0;

        // Find the number of connected components
        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                dfs(i, adj, visited);
                numComponents++;
            }
        }

        return n - numComponents;
    }
    public static void main(String[] args) {

    }
}
