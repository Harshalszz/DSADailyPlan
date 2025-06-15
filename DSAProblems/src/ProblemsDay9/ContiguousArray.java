package ProblemsDay9;

import java.util.HashMap;

public class ContiguousArray {
//https://leetcode.com/problems/contiguous-array/description/
    public static  int lenContiguousArray(int[] nums){
        HashMap<Integer,Integer> countMap = new HashMap<>();

        int count = 0, res = 0;
        countMap.put(0,-1);

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                count += -1;
            }else{
                count += 1;
            }

            if(countMap.containsKey(count)){
                res = Math.max(res, i - countMap.get(count));
            }else{
                countMap.put(count,i);
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {0,1,1,1,1,1,0,0,0,0};
        System.out.println(lenContiguousArray(nums));

    }
}
