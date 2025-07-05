package ProblemsDay_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
//https://leetcode.com/problems/combination-sum-ii/description/
    private static void backtracking(List<List<Integer>> resList, List<Integer> tempList, int[] nums, int target, int index) {

        if(target == 0){
            resList.add(new ArrayList(tempList));
            return;
        }

        for(int i=index; i<nums.length; i++){

            if(i>index && nums[i] == nums[i-1]){
                continue;
            }

            if(nums[i] > target){
                break;
            }

            tempList.add(nums[i]);

            backtracking(resList,tempList,nums,target-nums[i], i+1);

            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;
        // important to sort the array , to giev res in sotred mannner
        Arrays.sort(nums);
        List<List<Integer>> resList = new ArrayList<>();
        backtracking(resList, new ArrayList<>(), nums, target, 0);

        System.out.println(resList);
    }


}
