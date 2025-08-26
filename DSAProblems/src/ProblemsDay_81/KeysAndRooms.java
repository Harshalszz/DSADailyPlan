package ProblemsDay_81;

import java.util.List;

public class KeysAndRooms {

    //https://leetcode.com/problems/keys-and-rooms/?envType=study-plan-v2&envId=leetcode-75

    static int count;

    public void dfs(List<List<Integer>> rooms , int[] visited, int source){

        visited[source] = 1;
        count++;

        for(int key : rooms.get(source)){
            if(visited[key] == 0){
                visited[key] = 1;
                dfs(rooms, visited, key);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        count = 0;
        int n = rooms.size();
        int[] visited = new int[n];

        dfs(rooms, visited, 0); // 0 room is unlocked

        return count == n;

    }

    public static void main(String[] args) {

    }
}
