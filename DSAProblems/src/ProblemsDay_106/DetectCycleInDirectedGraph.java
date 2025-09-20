package ProblemsDay_106;

import java.util.ArrayList;

public class DetectCycleInDirectedGraph {

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){

        int[] visited = new int[V];
        int[] pathVis = new int[V];

        for(int i=0; i<V;i++){

            if(visited[i] == 0){
                if(dfsCycle(i, visited,pathVis,adj) == true){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfsCycle(int i, int[] visited, int[] pathVis, ArrayList<ArrayList<Integer>> adj) {

        visited[i] = 1;
        pathVis[i] = 1;

        for(int it : adj.get(i)){

            if(visited[it] == 0){
                if(dfsCycle(it , visited,pathVis,adj) == true){
                    return true;
                }else if(pathVis[i] == 1){
                    return true;
                }
            }
        }

        pathVis[i] = 0;
        return false;
    }

    public static void main(String[] args) {

    }
}
