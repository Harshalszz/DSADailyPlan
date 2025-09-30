package ProblemsDay_115;

import java.util.TreeMap;

public class FindRightInterval {

    //https://leetcode.com/problems/find-right-interval/?envType=study-plan-v2&envId=binary-search

    public int[] findRightInterval(int[][] intervals) {

        int n = intervals.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<n; ++i) {
            map.put(intervals[i][0], i);
        }

        int res[] = new int[n];
        for(int i=0; i<n; ++i) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            Integer key = map.ceilingKey(end);
            res[i] = key != null ? map.get(key) : -1;
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
