package ProblemsDay_146;

import java.util.Arrays;

public class ThekStrongestValueArray {

    //https://leetcode.com/problems/the-k-strongest-values-in-an-array/?envType=problem-list-v2&envId=two-pointers
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int median=arr[(arr.length-1)/2];
        int i=0;
        int j=arr.length-1;
        int res=0;
        int[] result=new int[k];
        while(res<k)
        {
            if(Math.abs(arr[i]-median)>Math.abs(arr[j]-median))
            {
                result[res]=arr[i];
                i++;
                res++;
            }
            else{
                result[res]=arr[j];
                j--;
                res++;
            }
        }
        return result;

    }
    public static void main(String[] args) {

    }
}
