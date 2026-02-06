package ProblemsDay_243;

import java.util.Arrays;

public class HeightChecker {
//https://leetcode.com/problems/height-checker/?envType=problem-list-v2&envId=array
    public int heightChecker(int[] heights) {
        int n = heights.length;
        // copy original array
        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = heights[i];
        }
        // sort heights array
        Arrays.sort(heights);
        // count mismatched positions
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (original[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {

    }
}
