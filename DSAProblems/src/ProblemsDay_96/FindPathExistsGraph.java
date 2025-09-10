package ProblemsDay_96;

import java.util.ArrayList;
import java.util.List;

public class FindPathExistsGraph {
    //https://leetcode.com/problems/find-if-path-exists-in-graph/?envType=problem-list-v2&envId=graph

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Step 2: DFS to find a path
        boolean[] visited = new boolean[n];
        return dfs(graph, source, destination, visited);
    }

    private boolean dfs(List<List<Integer>> graph, int current, int destination, boolean[] visited) {
        if (current == destination) return true;
        visited[current] = true;

        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                if (dfs(graph, neighbor, destination, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
