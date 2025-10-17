package ProblemsDay_132;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {

//https://leetcode.com/problems/brick-wall/
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (List<Integer> lt : wall) {
            int sum = 0;
            for (int i = 0; i < lt.size() - 1; i++) {
                sum += lt.get(i);
                mp.put(sum, mp.getOrDefault(sum, 0) + 1);
            }
        }

        int min = wall.size();
        for (Map.Entry<Integer, Integer> a : mp.entrySet()) {
            min = Math.min(min, wall.size() - a.getValue());
        }

        return min;
    }
    public static void main(String[] args) {

    }
}
