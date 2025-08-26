package ProblemsDay_81;

import java.util.ArrayList;
import java.util.List;

public class NumberProvinces {

    //https://leetcode.com/problems/number-of-provinces/

    private void dfs(List<List<Integer>> adj,boolean vis[],int x){

        vis[x] = true;

        for(int key : adj.get(x)){
            if(!vis[key]){
                dfs(adj,vis,key);
            }
        }
    }


    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adj.get(i).add(j);
                }
            }
        }
        boolean vis[] = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                count++;
                dfs(adj,vis,i);
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
