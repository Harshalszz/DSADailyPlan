package ProblemsDay_201;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII {

//https://leetcode.com/problems/majority-element-ii/?envType=problem-list-v2&envId=array
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int minCount=(int)Math.floor(n/3),count=0;
        Arrays.sort(nums);
        int val=nums[0];
        List<Integer> ans=new ArrayList<>();
        if(nums.length==1){
            ans.add(val);
            return ans;
        }
        if(minCount==0){
            for(int i=0;i<n-1;i++){
                if(nums[i]!=nums[i+1]){
                    ans.add(nums[i]);
                }
            }
            ans.add(nums[n-1]);
            return ans;
        }
        System.out.println(minCount);
        for(int i=1;i<n;i++){
            if(val==nums[i]){
                count++;
                if(count>=minCount){
                    ans.add(nums[i]);
                    while(i<n&&nums[i]==val){
                        i++;
                    }
                    i--;
                }
            }else{
                count=0;
            }
            val=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
