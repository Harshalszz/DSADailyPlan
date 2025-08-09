package ProblemsDay_64;

public class FindNearestPointThatHastheSameXYCoordinate {
//https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDist = Integer.MAX_VALUE;
        int index=-1;

        for(int i=0; i<points.length; i++){

            if(points[i][0] == x || points[i][1] == y){

                int dist = Math.abs(x-points[i][0]) + Math.abs(y-points[i][1]);

                // Update if distance is smaller or it's the first valid point
                if (dist < minDist) {
                    minDist = dist;
                    index = i;
                }
            }
        }

        return index;

    }

    public static void main(String[] args) {

    }
}
