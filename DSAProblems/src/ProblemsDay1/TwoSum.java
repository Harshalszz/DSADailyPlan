package ProblemsDay1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //https://leetcode.com/problems/two-sum/description/
    //hello
    public static int[] twoSum(int[] nums , int target){
        Map<Integer, Integer> valueIndexPair = new HashMap<>();

        for (int i=0; i<nums.length ; i++){
            int rem = target - nums[i];
            if (valueIndexPair.containsKey(rem)){
                return new int[] {i,valueIndexPair.get(rem)};
            }
            valueIndexPair.put(nums[i], i);
        }

        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}


