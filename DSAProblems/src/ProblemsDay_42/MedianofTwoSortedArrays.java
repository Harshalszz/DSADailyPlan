package ProblemsDay_42;

public class MedianofTwoSortedArrays {
    //https://leetcode.com/problems/median-of-two-sorted-arrays/description/

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] new_arr = new int[n];

        int i=0, j=0, k=0;

        while (i<=n1 && j<=n2) {
            if (i == n1) {
                while(j<n2) new_arr[k++] = nums2[j++];
                break;
            } else if (j == n2) {
                while (i<n1) new_arr[k++] = nums1[i++];
                break;
            }

            if (nums1[i] < nums2[j]) {
                new_arr[k++] = nums1[i++];
            } else {
                new_arr[k++] = nums2[j++];
            }
        }

        if (n%2==0) return (float)(new_arr[n/2-1] + new_arr[n/2])/2;
        else return new_arr[n/2];
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,5,7,8};
        int[] nums2 = {3,4,9,10};

        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
}
