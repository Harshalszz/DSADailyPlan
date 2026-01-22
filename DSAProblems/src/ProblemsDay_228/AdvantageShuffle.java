package ProblemsDay_228;

import java.util.Arrays;

public class AdvantageShuffle {

    //https://leetcode.com/problems/advantage-shuffle/?envType=problem-list-v2&envId=array
    public int[] advantageCount(int[] nums1, int[] nums2) {
        if(nums1.length==1)return nums1;
        int ans[]=new int[nums1.length];
        Arrays.sort(nums1);
        int currIdx=0;
        while(currIdx!=ans.length){
            int pos=0;
            int searchVal=nums2[currIdx];
            while(pos<nums1.length&&nums1[pos]<=searchVal){
                pos++;
            }
            if(pos<nums1.length){
                ans[currIdx]=nums1[pos];
                nums1[pos]=-1;
            }else{
                pos=0;
                while(nums1[pos]==-1){
                    pos++;
                }
                ans[currIdx]=nums1[pos];
                nums1[pos]=-1;
            }
            currIdx++;

        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
