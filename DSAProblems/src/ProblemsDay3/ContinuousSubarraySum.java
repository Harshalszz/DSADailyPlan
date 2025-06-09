package ProblemsDay3;

import java.util.HashMap;

public class ContinuousSubarraySum {
//https://leetcode.com/problems/continuous-subarray-sum/description/?source=submission-ac
    public static boolean continuousSubarraySum(int[] nums, int k){
            /*
        Map<Integer, Integer> remMap = new HashMap<>();

        remMap.put(0,-1);

        int sum = 0;

        for ( int i=0; i<nums.length; i++){
            sum += nums[i];

            if(remMap.containsKey(sum%k)){
                if(i - remMap.get(sum%k) > 1){
                    return true;
                }
            }

            remMap.put(sum%k,i+1);
        }

        return false;*/

        int prefixMod = 0;
        HashMap<Integer, Integer> modSeen = new HashMap<>();
        modSeen.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefixMod = (prefixMod + nums[i]) % k;

            if (modSeen.containsKey(prefixMod)) {
                // ensures that the size of subarray is at least 2
                if (i - modSeen.get(prefixMod) > 1) {
                    return true;
                }
            } else {
                // mark the value of prefixMod with the current index.
                modSeen.put(prefixMod, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {23,2,4,6,7};
        int k = 6;

        System.out.println(continuousSubarraySum(nums,k));

    }
}
