package ProblemsDay_218;

public class CapacityShipPackagesWithinDDays {


    //https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/?envType=problem-list-v2&envId=binary-search
    public int shipWithinDays(int[] weights, int days) {
        int maxShipCapacity = 0;          // Sum of all weights (Upper Bound)
        int minShipCapacity = 0;          // Max single weight (Lower Bound)

        for (int weight : weights) {
            maxShipCapacity += weight;
            minShipCapacity = Math.max(minShipCapacity, weight);
        }

        int start = minShipCapacity;
        int end = maxShipCapacity;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (isShippingPossibleInGivenDays(weights, days, mid)) {
                // Capacity is valid, try smaller
                end = mid;
            } else {
                // Capacity is too small, need larger
                start = mid + 1;
            }
        }
        return end;
    }

    public boolean isShippingPossibleInGivenDays(int[] weights, int days, int capacity) {
        int daysTaken = 1; // Start with the first day
        int currentLoad = 0;

        for (int weight : weights) {
            // If adding this package exceeds capacity, ship current load and start next day
            if (currentLoad + weight > capacity) {
                daysTaken++;
                currentLoad = 0;
            }
            currentLoad += weight;
        }

        return daysTaken <= days;
    }
    public static void main(String[] args) {

    }
}
