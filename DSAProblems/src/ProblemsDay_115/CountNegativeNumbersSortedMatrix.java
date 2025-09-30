package ProblemsDay_115;

public class CountNegativeNumbersSortedMatrix {

    //https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/?envType=study-plan-v2&envId=binary-search
    public int countNegatives(int[][] grid) {

        int row = 0;
        int column = grid[0].length-1;
        int count = 0;
        while(row < grid.length && column >= 0){
            if(grid[row][column] < 0){
                count += grid.length-row;
                column--;
            }else {
                row++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
