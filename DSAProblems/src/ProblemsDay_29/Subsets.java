package ProblemsDay_29;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    //https://leetcode.com/problems/subsets/description/
    private static void backtracking(List<List<Integer>> resList, List<Integer> tempList, int start, int[] nums) {

        resList.add(new ArrayList(tempList));

        for(int i=start; i<nums.length;i++){

            tempList.add(nums[i]);

            backtracking(resList,tempList,i+1,nums);

            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};

        List<List<Integer>> resList = new ArrayList<>();

        backtracking(resList, new ArrayList<>(), 0, nums);

        System.out.println(resList);
    }


}
