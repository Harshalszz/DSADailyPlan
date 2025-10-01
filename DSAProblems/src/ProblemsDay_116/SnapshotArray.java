package ProblemsDay_116;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class SnapshotArray {

    //https://leetcode.com/problems/snapshot-array/?envType=study-plan-v2&envId=binary-search

    private List<TreeMap<Integer, Integer>> data;
    private int snapId;

    public SnapshotArray(int length) {
        data = new ArrayList<>();
        snapId = 0;
        for (int i = 0; i < length; i++) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            map.put(0, 0);  // Initially, all values are 0 at snap 0
            data.add(map);
        }
    }

    public void set(int index, int val) {
        data.get(index).put(snapId, val);
    }

    public int snap() {
        return snapId++;
    }

    public int get(int index, int snap_id) {
        return data.get(index).floorEntry(snap_id).getValue();
    }

    public static void main(String[] args) {

    }
}
