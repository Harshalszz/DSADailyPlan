package ProblemsDay_153;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountofSmallerNumbersAfterSelf {

    //https://leetcode.com/problems/count-of-smaller-numbers-after-self/?envType=problem-list-v2&envId=merge-sort
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> li = new ArrayList<>();
        List<Integer> sorted = new ArrayList<>();

        for(int i=nums.length-1;i>=0;i--){
            int ind = insert(sorted,nums[i]);
            li.add(ind);
            sorted.add(ind, nums[i]);
        }

        Collections.reverse(li);
        return li;
    }
    private int insert(List<Integer> arr, int num){
        int l =0;
        int r = arr.size()-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr.get(mid)< num){
                l = mid+1;
            }else r = mid-1;
        }

        return l;
    }
    public static void main(String[] args) {

    }
}
