package ProblemsDay_105;

public class SurroundedRegions {

    //https://leetcode.com/problems/surrounded-regions/?envType=study-plan-v2&envId=top-interview-150

    public void dfs(int i, int j, char[][] board, int[][] visited, int[] rowT, int[] colT){
        visited[i][j] = 1;
        int n = board.length, m= board[0].length;

        for(int b=0; b<4; b++){
            int newR = i + rowT[b];
            int newC = j + colT[b];

            if(newR >=0 && newR<n && newC>=0 && newC<m  && visited[newR][newC] ==0 && board[newR][newC] == 'O'){
                dfs(newR, newC, board, visited, rowT,colT);
            }
        }
    }

    public void solve(char[][] board) {

        int n = board.length, m= board[0].length;
        int[][] visited = new int[n][m];

        int[] rowT = {-1,0,1,0};
        int[] colT = {0,1,0,-1};

        // iterate over row first row and last row

        for(int j=0; j<m;j++){

            //for first row
            if(board[0][j] == 'O' && visited[0][j] == 0){
                dfs(0, j, board,visited, rowT,colT);
            }

            //for last row
            if(board[n-1][j] == 'O' && visited[n-1][j] == 0){
                dfs(n-1, j, board,visited, rowT,colT);
            }
        }

        //for first col and last col

        for(int i=0; i<n;i++){

            //for first col
            if(board[i][0] == 'O' && visited[i][0] == 0){
                dfs(i, 0, board,visited, rowT,colT);
            }

            //for last col
            if(board[i][m-1] == 'O' && visited[i][m-1] == 0){
                dfs(i, m-1, board,visited, rowT,colT);
            }
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] == 'O' && visited[i][j] == 0){
                    board[i][j] = 'X';
                }
            }
        }




    }

    public static void main(String[] args) {

    }
}
