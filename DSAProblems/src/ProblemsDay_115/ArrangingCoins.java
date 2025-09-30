package ProblemsDay_115;

public class ArrangingCoins {

    //https://leetcode.com/problems/arranging-coins/?envType=study-plan-v2&envId=binary-search
    public int arrangeCoins(int n) {

        // int res = 0, i =1;

        // while(n >= 0){

        //     n = n-i;
        //     res++;
        //     i++;
        // }

        // return res - 1;

        int s = 1;
        int e = n;
        while(s<=e){
            int mid = s + (e-s)/2;
            long sum = (long)mid*(mid+1)/2;
            if(sum == n) return mid;
            else if(sum > n) e = mid-1;
            else s = mid+1;
        }
        return s-1;

    }

    public static void main(String[] args) {

    }
}
