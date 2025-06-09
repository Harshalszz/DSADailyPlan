package ProblemsDay3;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
//https://leetcode.com/problems/subarray-sum-equals-k/description/
    public static int subarraySumEqualsK(int[] nums , int k){
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0,1);

        int result = 0 ,prefixSum = 0;

        for (int i = 0; i<nums.length; i++){
            prefixSum +=nums[i];

            if(sumMap.containsKey(prefixSum - k)){
                result += sumMap.get(prefixSum - k);
            }

            sumMap.put(prefixSum ,sumMap.getOrDefault(prefixSum,0)+1 );
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        int k = 3;

        System.out.println(subarraySumEqualsK(nums, k));

    }
}
