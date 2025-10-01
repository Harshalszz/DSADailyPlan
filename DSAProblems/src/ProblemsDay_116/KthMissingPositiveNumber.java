package ProblemsDay_116;

public class KthMissingPositiveNumber {

    //https://leetcode.com/problems/kth-missing-positive-number/?envType=study-plan-v2&envId=binary-search

    public int findKthPositive(int[] arr, int k) {

        // Set<Integer> st = new HashSet<>();
        // for(int num : arr) st.add(num);

        // int cnt = 0, num = 1;
        // while(cnt < k) {
        //     if(!st.contains(num)) cnt++;
        //     num++;
        // }
        // return num - 1;

        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]-(mid+1)>=k)
                high=mid-1;
            else
                low=mid+1;
        }
        return low+k;

    }



    public static void main(String[] args) {

    }
}
