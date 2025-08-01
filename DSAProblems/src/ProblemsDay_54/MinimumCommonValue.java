package ProblemsDay_54;

public class MinimumCommonValue {
    //https://leetcode.com/problems/minimum-common-value/

    public int getCommon(int[] nums1, int[] nums2) {

        int i=0 ,j=0;

        while(j<nums2.length && i<nums1.length){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

    }
}
