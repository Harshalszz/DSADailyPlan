package ProblemsDay_137;

public class CarPooling {

    //https://leetcode.com/problems/car-pooling/?envType=problem-list-v2&envId=prefix-sum

    public boolean carPooling(int[][] trips, int capacity) {
        int[] stops = new int[1001];

        for (int[] trip : trips) {
            int numPassengers = trip[0];
            int from = trip[1];
            int to = trip[2];

            stops[from] += numPassengers;
            stops[to] -= numPassengers;
        }

        int currentPassengers = 0;
        for (int i = 0; i <= 1000; i++) {
            currentPassengers += stops[i];
            if (currentPassengers > capacity) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
