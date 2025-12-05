package ProblemsDay_180;

import java.util.Arrays;

public class SorttheStudentsTheirKthScore {
//https://leetcode.com/problems/sort-the-students-by-their-kth-score/
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,(a, b)-> b[k] - a[k]);
        return score;
    }
    public static void main(String[] args) {

    }
}
