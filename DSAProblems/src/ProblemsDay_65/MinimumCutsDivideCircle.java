package ProblemsDay_65;

public class MinimumCutsDivideCircle {
 //https://leetcode.com/problems/minimum-cuts-to-divide-a-circle/

    public int numberOfCuts(int n) {
        if(n==1){
            return 0;
        }

        return n%2==0?n/2:n;

    }

    public static void main(String[] args) {

    }
}
