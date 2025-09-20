package ProblemsDay_106;

import java.util.ArrayList;

public class CourseSchedule {

    //https://leetcode.com/problems/course-schedule/?envType=study-plan-v2&envId=top-interview-150

    // used dfs to detect cycle

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int V = numCourses;
        int E = prerequisites.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for(int i = 0; i < E; i++){
            int node1 = prerequisites[i][0];
            int node2 = prerequisites[i][1];
            adj.get(node2).add(node1);
        }

        return !detectCycle(V,adj);

    }

    public boolean detectCycle(int V, ArrayList<ArrayList<Integer>> adj){

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
                if(dfsCycle(it , visited,pathVis,adj)){
                    return true;
                }
            }else if(pathVis[it] == 1){
                return true;
            }
        }

        pathVis[i] = 0;
        return false;
    }

    public static void main(String[] args) {

    }
}
