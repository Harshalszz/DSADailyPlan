package ProblemsDay_30;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
//https://leetcode.com/problems/n-queens/description/
    public static void backtracking(char[][] board, int col, List<List<String>> resList, int[] leftRow,int[] lowerD, int[] upperD){
        // if col exceeds the bpard , we have find one possible answer store it in res lIst
        if(col == board.length){
            resList.add(construct(board));
        }

        for(int row = 0; row < board.length; row++){
            // checking the leftrow if queen is present
            // row + col =0 if in left lower diagoanl queen is  not present
            // **board.length -1 + col - row** to check if the left upper diagonal queen is present.
            if(leftRow[row] == 0 && lowerD[row+col] == 0 && upperD[board.length -1 + col - row] == 0){

                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerD[row + col] = 1;
                upperD[board.length-1 + col-row] =1;

                backtracking(board,col+1, resList,leftRow,lowerD,upperD);

                board[row][col] = '.';
                leftRow[row] = 0;
                lowerD[row + col] = 0;
                upperD[board.length-1 + col-row] =0;
            }
        }

    }

    public static List<String> construct(char[][] board){

        List<String> res = new ArrayList<>();

        for(int i=0; i<board.length; i++){
            //res.add(board[i].toString()); // if use this it will give hashcode string

            String s = new String(board[i]);
            res.add(s);
        }

        return res;
    }

    public static void main(String[] args) {
        int n= 6;

        char[][] board = new char[n][n];

        for(int i=0; i<n;i++){
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> resList = new ArrayList<>();

        int[] leftRow = new int[n]; // checking if there is a Queen at left side of row
        int[] lowerD = new int[2*n -1]; // checking if queen is present at left lower diagonal
        int[] upperD = new int[2*n -1]; // checking if quuen is preent at left upper diagonal

        backtracking(board, 0 , resList, leftRow,lowerD,upperD);

        System.out.println(resList);
    }
}
