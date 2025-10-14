package ProblemsDay_129;

import java.util.HashMap;

public class SubarraySumsDivisiblebyK {


    //https://leetcode.com/problems/subarray-sums-divisible-by-k/
    public int subarraysDivByK(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        prefix[0] = nums[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        int count = 0;
        for(int i=0;i<prefix.length;i++){
            int mod = ((prefix[i] % k) + k) % k;
            if(map.containsKey(mod)){
                count += map.get(mod);
                map.put(mod, map.get(mod) + 1);
            } else {
                map.put(mod, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
