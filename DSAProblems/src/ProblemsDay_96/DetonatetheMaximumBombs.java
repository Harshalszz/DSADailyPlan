package ProblemsDay_96;

import java.util.ArrayList;
import java.util.List;

public class DetonatetheMaximumBombs {
    //https://leetcode.com/problems/detonate-the-maximum-bombs/?envType=problem-list-v2&envId=graph

    private int dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;
        int count = 1;
        for (int nei : graph.get(node)) {
            if (!visited[nei]) {
                count += dfs(nei, graph, visited);
            }
        }
        return count;
    }

    public int maximumDetonation(int[][] bombs) {

        int n = bombs.length;

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < n; i++) {
            long x1 = bombs[i][0], y1 = bombs[i][1], r1 = bombs[i][2];
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                long x2 = bombs[j][0], y2 = bombs[j][1];

                long dx = x1 - x2;
                long dy = y1 - y2;
                long distSq = dx * dx + dy * dy;
                long radSq = r1 * r1;

                if (distSq <= radSq) {

                    graph.get(i).add(j);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            int count = dfs(i, graph, visited);
            max = Math.max(max, count);
        }

        return max;

    }

    public static void main(String[] args) {

    }
}
