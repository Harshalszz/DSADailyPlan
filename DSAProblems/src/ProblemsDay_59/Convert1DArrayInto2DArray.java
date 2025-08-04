package ProblemsDay_59;

import java.util.Arrays;

public class Convert1DArrayInto2DArray {

    //https://leetcode.com/problems/convert-1d-array-into-2d-array/
    public int[][] construct2DArray(int[] original, int m, int n) {

        if (m * n != original.length) {
            return new int[0][0];
        }

        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i] = Arrays.copyOfRange(original, i * n, (i + 1) * n);
            }
        }

        return res;

    }
    public static void main(String[] args) {

    }
}
