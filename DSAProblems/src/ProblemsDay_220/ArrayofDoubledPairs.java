package ProblemsDay_220;

import java.util.Map;
import java.util.TreeMap;

public class ArrayofDoubledPairs {
//https://leetcode.com/problems/array-of-doubled-pairs/?envType=problem-list-v2&envId=array
    public boolean canReorderDoubled(int[] arr) {

        Map<Integer, Integer> count = new TreeMap<>();
        for (int a : arr)
            count.put(a, count.getOrDefault(a, 0) + 1);
        for (int x : count.keySet()) {
            if (count.get(x) == 0) continue;
            int want = x < 0 ? x / 2 : x * 2;
            if (x < 0 && x % 2 != 0 || count.get(x) > count.getOrDefault(want, 0))
                return false;
            count.put(want, count.get(want) - count.get(x));
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
