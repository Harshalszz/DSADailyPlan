package ProblemsDay_225;

public class MaximizeDistanceClosestPerson {

    public int maxDistToClosest(int[] seats) {
        int l = -1;
        int r = 0;
        int max = 1;
        for (; r < seats.length; r++) {
            if (seats[r] == 1) {
                if (l == -1) max = r;
                max = Math.max(max, (r - l) / 2);
                l = r;
            }
        }
        return Math.max(max, r - l - 1);
    }
    public static void main(String[] args) {

    }
}
