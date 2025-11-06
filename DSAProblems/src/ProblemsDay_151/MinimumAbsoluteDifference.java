package ProblemsDay_151;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {

    //https://leetcode.com/problems/minimum-absolute-difference/?envType=problem-list-v2&envId=sorting
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            int diff = arr[i+1] - arr[i];
            if(diff <= min){
                if(diff < min){
                    min = diff;
                    res.clear();
                }
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
