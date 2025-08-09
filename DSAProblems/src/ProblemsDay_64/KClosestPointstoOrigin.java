package ProblemsDay_64;

import java.util.Arrays;

public class KClosestPointstoOrigin {

    //https://leetcode.com/problems/k-closest-points-to-origin/
    public int[][] kClosest(int[][] points, int k) {

        //We can sort the array in ascending order on the basis of distance(x^2 + y^2)
        Arrays.sort(points, (a, b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]));
        //now after sorting we can return the copy of range from points array from 0 to k-1 index
        return Arrays.copyOfRange(points, 0, k);

    }


    public static void main(String[] args) {

    }
}
