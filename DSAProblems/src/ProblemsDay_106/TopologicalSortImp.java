package ProblemsDay_106;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortImp {

    //topological sort is doen for only dicrected acyclic graph
    // it state that for a rede u->v, u shoulld always appera before v.



    public int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj){

        int[] visited = new int[V];

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<V; i++){
            if(visited[i] == 0){
                dfsTopo(i, visited, stack, adj);
            }
        }

        int[] res = new int[V];
        int i=0;
        while(!stack.isEmpty()){
            res[i++] = stack.peek();
            stack.pop();
        }

        return res;

    }

    private void dfsTopo(int i, int[] visited, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adj) {

        visited[i] = 1;
        for(int it : adj.get(i)){
            if(visited[it] == 0){
                dfsTopo(it, visited,stack,adj);
            }
        }

        stack.push(i);
    }

    public static void main(String[] args) {

    }
}
