package ProblemsDay_203;

public class ToeplitzMatrix {
//https://leetcode.com/problems/toeplitz-matrix/?envType=problem-list-v2&envId=array
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++)
            for (int j = 1; j < matrix[0].length; j++)
                if (matrix[i][j] != matrix[i - 1][j - 1])
                    return false;
        return true;
    }

    public static void main(String[] args) {

    }
}
