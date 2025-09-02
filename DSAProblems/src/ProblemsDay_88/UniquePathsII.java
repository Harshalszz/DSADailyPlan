package ProblemsDay_88;

public class UniquePathsII {
    //https://leetcode.com/problems/unique-paths-ii/

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        //for first row
        boolean flag = false;

        for(int j =0 ; j<n ; j++){
            if(flag || obstacleGrid[0][j] == 1){
                flag = true;
                dp[0][j] = 0;
            }else{
                dp[0][j] = 1;
            }
        }
        // for first colunm
        flag = false;

        for(int i =0 ; i<m ; i++){
            if(flag || obstacleGrid[i][0] == 1){
                flag = true;
                dp[i][0] = 0;
            }else{
                dp[i][0] = 1;
            }
        }


        for(int  i= 1; i<m; i++){
            for(int j=1 ; j<n; j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        return dp[m-1][n-1];



    }

    public static void main(String[] args) {

    }
}
