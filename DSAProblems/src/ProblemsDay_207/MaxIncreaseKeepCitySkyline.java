package ProblemsDay_207;

import java.util.stream.IntStream;

public class MaxIncreaseKeepCitySkyline {

    //https:// leetcode.com/problems/max-increase-to-keep-city-skyline/?envType=problem-list-v2&envId=array
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;

        // Find the maximum elements in each row and column efficiently using streams
        int[] rowMax = IntStream.range(0, n)
                .map(r -> IntStream.of(grid[r]).max().orElse(0))  // Efficiently find row max using stream
                .toArray();
        int[] colMax = IntStream.range(0, n)
                .map(c -> IntStream.range(0, n).map(r -> grid[r][c]).max().orElse(0))  // Efficiently find col max using stream
                .toArray();

        // Calculate the total increase while maintaining the skyline
        int totalIncrease = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                totalIncrease += Math.min(rowMax[r], colMax[c]) - grid[r][c];
            }
        }

        return totalIncrease;
    }
    public static void main(String[] args) {

    }
}
