package ProblemsDay_16;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
//https://leetcode.com/problems/contains-duplicate/description/
    public static boolean containsDuplicate(int[] nums){

        Set<Integer> setNum = new HashSet<>();

        for(int n : nums){
            if(setNum.contains(n)){
                return true;
            }else{
                setNum.add(n);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};

        System.out.println(containsDuplicate(nums));

    }
}
