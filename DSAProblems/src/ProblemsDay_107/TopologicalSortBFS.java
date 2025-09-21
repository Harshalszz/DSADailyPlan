package ProblemsDay_107;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class TopologicalSortBFS {


    public int[] topoSortBFS(int V, ArrayList<ArrayList<Integer>> adj){

        int[] indegree = new int[V];

        for(int i=0; i<V; i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<V; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        int[] res = new int[V];

        int i=0;
        while(!queue.isEmpty()){

            int node = queue.peek();
            queue.remove();

            //saving the node in result array fro topo sort
            res[i++] = node;

            //after saving decreemtn the indgreed of that node
            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    queue.add(it);
                }
            }
        }

        return res;

    }


    public static void main(String[] args) {

    }
}
