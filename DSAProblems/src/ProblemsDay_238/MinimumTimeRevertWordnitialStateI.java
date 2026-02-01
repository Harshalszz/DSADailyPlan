package ProblemsDay_238;

public class MinimumTimeRevertWordnitialStateI {

    //https://leetcode.com/problems/minimum-time-to-revert-word-to-initial-state-i/
    public int minimumTimeToInitialState(String word, int k) {
        int i=0,n=word.length(),res=0;
        while(i+k-1<n-1){
            res++;
            if(word.substring(i+k,n).equals(word.substring(0,n-(i+k))))return res;
            i+=k;
        }
        return res+1;
    }
    public static void main(String[] args) {

    }
}
