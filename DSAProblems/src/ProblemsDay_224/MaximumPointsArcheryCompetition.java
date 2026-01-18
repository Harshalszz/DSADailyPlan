package ProblemsDay_224;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class obj{
    int val;
    List<Integer> l;
    obj(int val,List<Integer>l){
        this.val=val;
        this.l=l;
    }
    obj(obj o,int in,int value){
        this.l=new ArrayList<>(o.l);
        this.l.add(in);
        this.val=value;
    }
}
public class MaximumPointsArcheryCompetition {
//https://leetcode.com/problems/maximum-points-in-an-archery-competition/
    obj dp[][];
    public obj rec(int i,int numArrows,int arr[]){
        if(dp[i][numArrows]!=null)
            return dp[i][numArrows];
        if(i==arr.length-1){
            if(numArrows>arr[i])
                dp[i][numArrows]=new obj(i, Arrays.asList(numArrows));
            else
                dp[i][numArrows]=new obj(0,Arrays.asList(numArrows));
            return dp[i][numArrows];
        }
        if(numArrows>arr[i]){
            obj o1=rec(i+1,numArrows,arr);
            obj o2=rec(i+1,numArrows-arr[i]-1,arr);
            if(o2.val+i>o1.val)
                dp[i][numArrows]=new obj(o2,arr[i]+1,o2.val+i);
            else
                dp[i][numArrows]=new obj(o1,0,o1.val);
        }else{
            obj o1=rec(i+1,numArrows,arr);
            dp[i][numArrows]=new obj(o1,0,o1.val);
        }
        return dp[i][numArrows];
    }
    public int[] maximumBobPoints(int numArrows, int[] aliceArrows) {
        dp=new obj[12][numArrows+1];
        obj res_obj=rec(0,numArrows,aliceArrows);
        int result[]=new int[12],in=12;
        for(int val:res_obj.l)
            result[--in]=val;
        return result;
    }
    public static void main(String[] args) {

    }
}
