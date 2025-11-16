package ProblemsDay_161;

public class CheckifGridSatisfiesConditions {

    //https://leetcode.com/problems/check-if-grid-satisfies-conditions/
    public boolean satisfiesConditions(int[][] grid) {
        // 1. Get the dimensions of the grid.  We need to know how big it is. 📏
        int rows = grid.length;         // Get the number of rows.
        int cols = grid[0].length;      // Get the number of columns (assuming all rows have the same length).

        // 2. Loop through EVERY cell in the grid. We have to check them all! 🧐
        for (int i = 0; i < rows; i++) {         // Loop through each row (i is the row number).
            for (int j = 0; j < cols; j++) {    // Loop through each column in the current row (j is the column number).

                // 3. Check the Vertical Rule (if there's a cell below). 👇
                if (i + 1 < rows && grid[i][j] != grid[i + 1][j]) {
                    // If there's a cell below (i+1 is a valid row) AND the values are NOT equal...
                    return false;  // ...then the grid breaks the rules!  Return false immediately. 💔
                }

                // 4. Check the Horizontal Rule (if there's a cell to the right). ➡️
                if (j + 1 < cols && grid[i][j] == grid[i][j + 1]) {
                    // If there's a cell to the right (j+1 is a valid column) AND the values ARE equal...
                    return false;  // ...then the grid breaks the rules! Return false immediately. 💔
                }
            }
        }

        // 5. If we made it through all the cells without finding a problem... 🎉
        return true; // ...then the grid follows the rules! Return true. ✅
    }
    public static void main(String[] args) {

    }
}
