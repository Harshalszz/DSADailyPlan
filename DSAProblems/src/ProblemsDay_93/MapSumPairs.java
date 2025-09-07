package ProblemsDay_93;

import java.util.HashMap;
import java.util.Map;

public class MapSumPairs {
    //https://leetcode.com/problems/map-sum-pairs/description/?envType=problem-list-v2&envId=trie

    class MapSum {

        Map<String , Integer> map;

        public MapSum() {
            map = new HashMap<>();

        }

        public void insert(String key, int val) {

            map.put(key,val);

        }

        public int sum(String prefix) {

            int sum = 0;

            for(String key : map.keySet()){
                if(key.startsWith(prefix)){
                    sum += map.get(key);
                }
            }

            return sum;

        }
    }

    public static void main(String[] args) {

    }
}
