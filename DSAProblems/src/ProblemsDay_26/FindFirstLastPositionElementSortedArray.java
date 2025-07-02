package ProblemsDay_26;

import java.util.Arrays;

public class FindFirstLastPositionElementSortedArray {

    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        if (nums.length == 0 ){
            return ans;
        }
        if(target > nums[nums.length - 1] || target < nums[0] ){
            return ans;
        }

        ans[0] = binarySearch(nums, target, true);
        ans[1] = binarySearch(nums, target, false);

        return ans;

    }

    public static int binarySearch(int[] arr, int target, boolean isFirstPoistion){

        int start = 0;
        int end = arr.length -1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid +1;
            }else if(target < arr[mid]){
                end = mid -1;
            }else{
                ans = mid;
                if(isFirstPoistion){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        }

        return ans;
    }
    public static void main(String[] args) {

        int[] nums= {5,7,7,8,8,8,9,9,10};
        int target = 9;

        System.out.println(Arrays.toString(searchRange(nums,target)));

    }
}
