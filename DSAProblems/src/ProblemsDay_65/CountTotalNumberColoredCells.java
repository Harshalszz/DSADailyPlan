package ProblemsDay_65;

public class CountTotalNumberColoredCells {
    //https://leetcode.com/problems/count-total-number-of-colored-cells/description/

    public long coloredCells(int n) {

        return 1 + 4L * n * (n - 1) / 2;

    }

    public static void main(String[] args) {

    }
//    Minute 1:
//    Only the center cell is colored
//    Total cells: 1
//    Added cells: 0
//    Minute 2:
//            4 cells are added around the center
//    Total cells: 5 (1 + 4)
//    Added cells: 4
//    Minute 3:
//            8 additional cells are added around the previous region
//    Total cells: 13 (1 + 4 * 3)
//    Added cells: 8
//    Minute 4:
//            12 additional cells are added around the previous region
//    Total cells: 25 (1 + 4 * 6)
//    Added cells: 12

}
