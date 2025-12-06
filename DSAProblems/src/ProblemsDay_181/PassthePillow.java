package ProblemsDay_181;

public class PassthePillow {
//https:/ /leetcode.com/problems/pass-the-pillow/
    public int passThePillow(int n, int time) {
        int completed = time/(n-1);
        int remaining = time%(n-1);
        int ans = 0;
        if(completed%2!=0){
            ans = n - remaining;
        }else{
            ans = remaining + 1;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
