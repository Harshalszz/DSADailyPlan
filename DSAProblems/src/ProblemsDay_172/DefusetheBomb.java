package ProblemsDay_172;

public class DefusetheBomb {

    //https://leetcode.com/problems/defuse-the-bomb/?envType=problem-list-v2&envId=sliding-window
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int ans[] = new int[n];
        int start = 0, end =0;
        if(k==0)
            return ans;

        if(k>0)
        {
            start = 1;
            end = k ;
        }
        else
        {
            start = n-Math.abs(k);
            end = n-1;
        }
        int sum = 0;
        for(int i=start; i<=end; i++)
            sum += code[i];

        for(int i=0; i<n; i++)
        {
            ans[i] = sum ;
            sum = sum - code[(start)%n];
            sum = sum + code[(end+1)%n];
            start++;
            end++;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
