package ProblemsDay_82;

import java.util.ArrayList;
import java.util.List;

public class ReorderRoutestoMakeAllPathsLeadtotheCityZero {

    //https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/?envType=study-plan-v2&envId=leetcode-75
    public int minReorder(int n, int[][] connections) {

        List<List<int[]>> graph = new ArrayList<>();
        //Initialize adjacency list
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        //Convert directed edges into an undirected representation
        //means adding reveral direction also
        // 1 reprent that direction we have added
        // 0 is already gievn direction
        for(int[] road : connections){
            graph.get(road[0]).add(new int[]{road[1],1});
            graph.get(road[1]).add(new int[]{road[0],0});
        }

        return dfs(graph , 0 ,-1);

    }

    private int dfs(List<List<int[]>> graph, int source, int parent){
        int reversal = 0;
        //Traverse all connected roads
        for(int[] road : graph.get(source)){
            int to = road[0];
            int dir = road[1]; // 1 if need reveral , 0 if already coorect dir

            if(to != parent){ // we are avoiding travesal back to parent node
                reversal += dir;
                reversal += dfs(graph, to, source);
            }
        }

        return reversal;
    }
    public static void main(String[] args) {

    }
}
