package ProblemsDay1;

import java.util.Arrays;

public class DuplicateNumber {
//https://leetcode.com/problems/find-the-duplicate-number/description/
    public static int duplicateNumber(int[] nums){
        /*Map<Integer,Integer> numberCount = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(numberCount.containsKey(nums[i])){
                return nums[i];
            }
            numberCount.put(nums[i],i);
        }

        return -1;*/

        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        fast = nums[0];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast; //as bointer the pointer are at same position , slow and fast is the ansor number

    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(duplicateNumber(nums));
    }
}
