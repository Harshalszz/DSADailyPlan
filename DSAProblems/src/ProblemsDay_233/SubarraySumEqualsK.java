package ProblemsDay_233;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
//https://leetcode.com/problems/subarray-sum-equals-k/
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        int res =0 ,sum = 0;
        map.put(0,1);

        for(int i=0; i<nums.length; i++){

            sum += nums[i];
            int rem = sum - k;

            if(map.containsKey(rem)){
                res += map.get(rem);
            }

            map.put(sum , map.getOrDefault(sum,0)+1);
        }

        return res;

    }
    public static void main(String[] args) {

    }
}
