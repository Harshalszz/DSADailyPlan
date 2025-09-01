package ProblemsDay_87;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    //https://leetcode.com/problems/combination-sum-iii/?envType=study-plan-v2&envId=leetcode-75

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> res = new ArrayList<>();

        slove(1, k, n, new ArrayList<>(), res);

        return res;
    }

    public void slove(int i, int k, int n, List<Integer> curr, List<List<Integer>> res){

        if(k==0 && n==0){
            res.add(curr);
            return;
        }

        if(i>9){
            return;
        }
        if(k<0 || n<0){
            return;
        }

        // to store the element with we are taking
        List<Integer> temp = new ArrayList<>(curr);
        temp.add(i);

        slove(i+1, k-1, n-i, temp,res);
        //not pickinhgthe element
        slove(i+1, k, n, curr,res);
    }

    public static void main(String[] args) {

    }
}
