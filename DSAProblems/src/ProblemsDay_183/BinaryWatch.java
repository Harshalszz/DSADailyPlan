package ProblemsDay_183;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
//https://leetcode.com/problems/binary-watch/?envType=problem-list-v2&envId=backtracking
    int maxHr = 11;
    int maxMin = 59;

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        int[] hour = {1, 2, 4, 8};
        int[] min = {1, 2, 4, 8, 16, 32};

        // Start recursion at index 0
        helper(result, hour, min, turnedOn, 0, 0, 0);
        return result;
    }

    public void helper(List<String> result, int[] hour, int[] min, int turnedOn, int currentHour, int currentMin, int index) {
        // Pruning: Invalid Time check
        if (currentHour > maxHr || currentMin > maxMin) return;

        // Base Case 1: Successfully used all required LEDs
        if (turnedOn == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(currentHour).append(":");
            if (currentMin < 10) sb.append("0");
            sb.append(currentMin);
            result.add(sb.toString());
            return;
        }

        // Base Case 2: Out of LEDs to check
        if (index == 10) return;

        // --- RECURSION (Two Choices) ---

        // CHOICE 1: Turn ON the current LED (Include)
        if (index < 4) {
            // Indices 0-3 are Hours
            helper(result, hour, min, turnedOn - 1, currentHour + hour[index], currentMin, index + 1);
        } else {
            // Indices 4-9 are Minutes (mapped to min array 0-5)
            helper(result, hour, min, turnedOn - 1, currentHour, currentMin + min[index - 4], index + 1);
        }

        // CHOICE 2: Leave the current LED OFF (Exclude/Skip)
        helper(result, hour, min, turnedOn, currentHour, currentMin, index + 1);
    }

    public static void main(String[] args) {

    }
}
