package ProblemsDay_82;

public class MaxAreaofIsland {

    //https://leetcode.com/problems/max-area-of-island/

    public int maxAreaOfIsland(int[][] grid) {

        if(grid == null || grid.length == 0){
            return 0;
        }

        int maxArea = 0;// as area cannot be negative

        for(int i=0; i<grid.length;i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){

                    maxArea = Math.max(maxArea, dfs(grid, i ,j ));
                }
            }
        }

        return maxArea;

    }

    public int  dfs(int[][] grid, int i , int j){


        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] != 1){
            return 0;
        }

        grid[i][j] = 0;
        int area = 1; // counting 1
        area += dfs(grid, i + 1, j); // down
        area += dfs(grid, i - 1, j); // up
        area += dfs(grid, i, j + 1); // right
        area += dfs(grid, i, j - 1); // left

        return area ;
    }

    public static void main(String[] args) {

    }
}
