package ProblemsDay_160;

import java.util.HashMap;
import java.util.Map;

public class RabbitsinForest {

    //https://leetcode.com/problems/rabbits-in-forest/?envType=problem-list-v2&envId=array
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int a : answers) {
            freq.put(a, freq.getOrDefault(a, 0) + 1);
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            int groupSize = k + 1;
            int groups = (v + k) / groupSize;
            count += groups * groupSize;
        }

        return count;
    }
    public static void main(String[] args) {

    }
}
