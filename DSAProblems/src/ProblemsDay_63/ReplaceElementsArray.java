package ProblemsDay_63;

import java.util.HashMap;

public class ReplaceElementsArray {
    //https://leetcode.com/problems/replace-elements-in-an-array/

    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> hash= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i], i);
        }
        for(var oper:operations){
            nums[hash.get(oper[0])]= oper[1];
            hash.put(oper[1], hash.get(oper[0]));
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}
