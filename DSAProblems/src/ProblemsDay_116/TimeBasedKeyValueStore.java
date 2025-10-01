package ProblemsDay_116;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValueStore {

    //https://leetcode.com/problems/time-based-key-value-store/?envType=study-plan-v2&envId=binary-search

    class TimeData{

        String value;
        int time;

        TimeData(String value, int time){
            this.value = value;
            this.time = time;
        }
    }

    class TimeMap {

        Map<String , List<TimeData>> map;

        public TimeMap() {
            map = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(new TimeData(value,timestamp));

        }

        public String get(String key, int timestamp) {

            if(!map.containsKey(key)){
                return "";
            }

            // we will find the value by binary serach

            List<TimeData> list = map.get(key);

            int left = 0, right = list.size()-1;
            String res = "";

            while(left<=right){
                int mid = left + (right-left)/2;

                if(list.get(mid).time <= timestamp){
                    res = list.get(mid).value;
                    left = mid +1;
                }else{
                    right = mid-1;
                }
            }

            return res;

        }
    }

    public static void main(String[] args) {

    }
}
