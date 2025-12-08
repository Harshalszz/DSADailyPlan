package ProblemsDay_183;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceTarget {
//https://leetcode.com/problems/all-paths-from-source-to-target/?envType=problem-list-v2&envId=backtracking
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        // Start DFS from node 0
        path.add(0);
        dfs(graph, 0, path, result);
        return result;
    }

    private void dfs(int[][] graph, int node, List<Integer> path, List<List<Integer>> result) {
        // If we reach the last node, add the path to result
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(path)); // make a copy
            return;
        }

        // Explore neighbors
        for (int neighbor : graph[node]) {
            path.add(neighbor);          // Choose
            dfs(graph, neighbor, path, result); // Explore
            path.remove(path.size() - 1); // Un-choose (backtrack)
        }
    }
    public static void main(String[] args) {

    }
}
