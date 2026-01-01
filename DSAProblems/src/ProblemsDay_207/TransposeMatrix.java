package ProblemsDay_207;

public class TransposeMatrix {
//https://leetcode.com/problems/transpose-matrix/?envType=problem-list-v2&envId=array
    public int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                res[c][r] = matrix[r][c];
            }
        }

        return res;
    }


    public static void main(String[] args) {

    }
}
