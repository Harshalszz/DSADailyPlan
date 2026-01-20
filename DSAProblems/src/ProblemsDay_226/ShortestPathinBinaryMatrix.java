package ProblemsDay_226;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathinBinaryMatrix {

    int[][] dir = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
    public int bfs(int[][] grid, boolean[][] isVisited){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        q.offer(new int[]{-1, -1}); // to track levels
        isVisited[0][0] = true;
        int levels = 1;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            if(curr[0]==grid.length-1 && curr[1]==grid[0].length-1) return levels;
            for(int[] d : dir){
                int x = curr[0] + d[0];
                int y = curr[1] + d[1];
                if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && !isVisited[x][y] && grid[x][y]==0){
                    isVisited[x][y] = true;
                    q.offer(new int[]{x, y});
                }
            }
            if(curr[0]==-1 && q.size()!=0) { // if (-1, -1) encountered => means a level completed and all the ngbrs for next level are pushed into the queue
                levels++; // so increase level
                q.offer(new int[]{-1, -1}); // and add mark for next level completion
            }
        }
        return levels;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1 || grid[grid.length-1][grid[0].length-1]==1) return -1;
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        int ans = bfs(grid, isVisited);

        if(!isVisited[grid.length-1][grid[0].length-1]) return -1; // if destination is not visited yet after bfs from source => impossible to reach from src
        return ans;
    }
    public static void main(String[] args) {

    }
}
