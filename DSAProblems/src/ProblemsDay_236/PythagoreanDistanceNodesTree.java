package ProblemsDay_236;

import java.util.*;

public class PythagoreanDistanceNodesTree {

    //https://leetcode.com/problems/pythagorean-distance-nodes-in-a-tree/
    public int[] bfs(int start , int n , List<List<Integer>> graph){
        int dist[] = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        Arrays.fill(dist , -1);

        dist[start] = 0;
        queue.offer(start);

        while(!queue.isEmpty()){
            int element = queue.poll();

            for(int i = 0 ; i < graph.get(element).size() ; i++){
                int neighbor = graph.get(element).get(i);

                if(dist[neighbor] == -1){
                    dist[neighbor] = dist[element] + 1;
                    queue.offer(neighbor);
                }
            }
        }

        return dist;
    }

    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
        List<List<Integer>> graph = new ArrayList<>();
        int count = 0;

        for(int i = 0 ; i < n ; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0 ; i < edges.length ; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            if(u != v){
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
        }

        int distx[] = bfs(x , n , graph);
        int disty[] = bfs(y , n , graph);
        int distz[] = bfs(z , n , graph);

        for(int i = 0 ; i < n ; i++){
            int dx = distx[i];
            int dy = disty[i];
            int dz = distz[i];

            int arr[] = {dx , dy , dz};
            Arrays.sort(arr);

            if((long)arr[0]*arr[0] + (long)arr[1]*arr[1] == (long)arr[2]*arr[2]){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {

    }
}
