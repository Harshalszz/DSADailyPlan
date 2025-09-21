package ProblemsDay_107;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleTopoBFS {

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

        int[] indegree = new int[V];

        for(int i=0; i<V; i++){
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }


        Queue<Integer> queue = new LinkedList<>();
        // note that in directed acyclic graph there will be alteat one node whose in degree will be zzero
        for(int i=0; i<V; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }
        // not using array as length will always be V
        //int[] res = new int[V];

        //hence using arrayList

        List<Integer> res = new ArrayList<>();

        while(!queue.isEmpty()){

            int node  = queue.peek();
            queue.remove();
            res.add(node);

            for(int it : adj.get(node)){
                indegree[it]--;

                if(indegree[it] == 0){
                    queue.add(it);
                }
            }
        }

        return res.size() == V;


    }

    public static void main(String[] args) {

    }
}
