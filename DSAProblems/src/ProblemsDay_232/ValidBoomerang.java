package ProblemsDay_232;

public class ValidBoomerang {

    //https://leetcode.com/problems/valid-boomerang/?envType=problem-list-v2&envId=array
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];

        return (y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1);
    }
    public static void main(String[] args) {

    }
}
