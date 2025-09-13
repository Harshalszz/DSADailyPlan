package ProblemsDay_99;

public class GameofLife {
    //https://leetcode.com/problems/game-of-life/?envType=study-plan-v2&envId=top-interview-150

    public int countLiveN(int[][] board, int i, int j){

        int count = 0;
        int n = board.length;
        int m = board[0].length;

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int d = 0; d < 8; d++) {
            int ni = i + dx[d];
            int nj = j + dy[d];

            if (ni >= 0 && ni < n && nj >= 0 && nj < m) {
                // Neighbors that were originally live
                if (board[ni][nj] == 1 || board[ni][nj] == -2) {
                    count++;
                }
            }
        }
        return count;

    }

    public void gameOfLife(int[][] board) {

        int n = board.length;
        int m = board[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){

                int liveN = countLiveN(board, i,j);

                if(board[i][j] == 1){
                    if(liveN < 2 || liveN >3){
                        board[i][j] = -2; // -2 denote that we make t5he cell as dead
                    }
                }else{
                    if(liveN == 3){
                        board[i][j] = 3; // 3 denotes live cell
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                if(board[i][j] == -2){
                    board[i][j] = 0;
                }else if(board[i][j] == 3){
                    board[i][j] = 1;
                }
            }
        }

    }

    public static void main(String[] args) {

    }
}
