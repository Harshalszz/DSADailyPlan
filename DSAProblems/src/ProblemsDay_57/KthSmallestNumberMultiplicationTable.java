package ProblemsDay_57;

public class KthSmallestNumberMultiplicationTable {
    //https://leetcode.com/problems/kth-smallest-number-in-multiplication-table/
    public int findKthNumber(int m, int n, int k) {

        int low = 1 , high = m*n;
        while(low<high){

            int mid = low + (high-low)/2;

            int counter = count(mid,m,n);

            if(counter >= k){
                high = mid;
            }else{
                low =mid+1;
            }

        }

        return low;

    }

    private int count(int mid , int m, int n){
        int count = 0;

        for(int i=1; i<=m;i++){
            int temp = Math.min(mid/i,n);
            count += temp;
        }

        return count;
    }


    public static void main(String[] args) {

    }
}
