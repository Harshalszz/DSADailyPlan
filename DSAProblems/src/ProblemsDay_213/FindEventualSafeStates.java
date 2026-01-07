package ProblemsDay_213;

import java.util.ArrayList;
import java.util.List;

public class FindEventualSafeStates {
//https://leetcode.com/problems/find-eventual-safe-states/?envType=problem-list-v2&envId=depth-first-search
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] state = new int[n]; // 0: unvisited, 1: visiting, 2: safe
        List<Integer> safe = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (dfs(graph, i, state)) {
                safe.add(i);
            }
        }

        return safe;
    }

    private boolean dfs(int[][] graph, int node, int[] state) {
        if (state[node] > 0) return state[node] == 2; // Already safe

        state[node] = 1; // Mark as visiting

        for (int next : graph[node]) {
            if (state[next] == 1 || !dfs(graph, next, state)) {
                return false; // Cycle detected
            }
        }

        state[node] = 2; // Mark as safe
        return true;
    }
    public static void main(String[] args) {

    }
}
