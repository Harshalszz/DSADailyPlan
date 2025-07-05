package ProblemsDay_29;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
//https://leetcode.com/problems/combination-sum/description/
    private static void backtracking(List<List<Integer>> resList, List<Integer> tempList, int[] nums, int target, int index, int total) {

        if(total == target){
            resList.add(new ArrayList(tempList));
            return;
        }

        if(total>target || index >=nums.length){
            return;
        }

        tempList.add(nums[index]);
        // adding the same ele again ,to check if that will be a possibel answer
        backtracking(resList,tempList, nums, target, index, total + nums[index]);

        tempList.remove(tempList.size()-1);

        //adding new /next ele
        backtracking(resList,tempList,nums,target,index+1, total);
    }

    public static void main(String[] args) {
        int[] nums = {2,3,6,7} ;
        int target = 7;

        List<List<Integer>> resList = new ArrayList<>();

        backtracking(resList, new ArrayList<>(), nums,target, 0 , 0);

        System.out.println(resList);
    }


}
