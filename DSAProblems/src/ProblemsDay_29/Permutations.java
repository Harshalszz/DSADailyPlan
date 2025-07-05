package ProblemsDay_29;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    //https://leetcode.com/problems/permutations/description/
    private static void backtracking(List<List<Integer>> resList, List<Integer> tempList, int[] nums) {

        if(tempList.size() == nums.length){
            resList.add(new ArrayList(tempList));
            return;
        }

        for(int n : nums){
            // if list has the ele already then skip thsi ele
            if(tempList.contains(n)){
                continue;
            }
            // add
            tempList.add(n);

            backtracking(resList,tempList,nums);

            tempList.remove(tempList.size()-1);
        }
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3};

        List<List<Integer>> resList = new ArrayList<>();

        backtracking(resList, new ArrayList<>(), nums);


        System.out.println(resList);
    }


}
