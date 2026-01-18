package ProblemsDay_224;

import java.util.ArrayList;
import java.util.List;

public class MaximumSplitofPositiveEvenIntegers {

//https://leetcode.com/problems/maximum-split-of-positive-even-integers/?envType=problem-list-v2&envId=backtracking
    private boolean maxSplit(long finalSum,long sum,List<Long> ans,long num){
        // if((num+sum)>finalSum){
        //     return false;
        // }
        ans.add(num);
        sum+=num;
        if(sum==finalSum){
            return true;
        }
        long next=num+2;
        if(sum+next>finalSum){
            long rem=finalSum-sum;
            ans.set(ans.size()-1,ans.get(ans.size()-1)+rem);
            return true;
        }
        return maxSplit(finalSum,sum,ans,next);
    }
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> ans=new ArrayList<>();
        if(finalSum%2!=0) return ans;
        maxSplit(finalSum,0,ans,2);
        return ans;
    }
    public static void main(String[] args) {

    }
}
