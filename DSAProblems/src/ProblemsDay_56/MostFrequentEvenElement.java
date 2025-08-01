package ProblemsDay_56;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {

    //https://leetcode.com/problems/most-frequent-even-element/

    public int mostFrequentEven(int[] nums) {
        Map<Integer , Integer> mp = new HashMap<>();
        for (int i : nums){
            if (i %2 == 0 && mp.containsKey(i))   //only filling even numbers in hashmap
                mp.put(i , mp.get(i) + 1);
            else if (i%2 == 0 && !mp.containsKey(i))
                mp.put(i , 1);
        }
        int ans = -1;
        int count = 0;
        for (Map.Entry<Integer, Integer> i : mp.entrySet()){
            if(count == i.getValue()){
                ans = Math.min(ans , i.getKey());   //taking small even number
            }
            if (i.getValue() > count){
                count = i.getValue();
                ans = i.getKey();
            }

        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
