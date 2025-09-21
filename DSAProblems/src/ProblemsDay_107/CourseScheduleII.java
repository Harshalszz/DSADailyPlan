package ProblemsDay_107;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {

    //https://leetcode.com/problems/course-schedule-ii/?envType=study-plan-v2&envId=top-interview-150

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int V = numCourses;
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[V];

        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        // note that in directed acyclic graph there will be alteat one node whose in degree will be zzero
        for(int i=0; i<V; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        int[] res = new int[V];
        int i=0;

        //hence using arrayList

        //List<Integer> res = new ArrayList<>();

        while(!queue.isEmpty()){

            int node  = queue.peek();
            queue.remove();
            res[i++] = node;

            for(int it : adj.get(node)){
                indegree[it]--;

                if(indegree[it] == 0){
                    queue.add(it);
                }
            }
        }

        return i == V ? res : new int[0];

    }

    public static void main(String[] args) {

    }
}
