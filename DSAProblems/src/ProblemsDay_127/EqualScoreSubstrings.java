package ProblemsDay_127;

public class EqualScoreSubstrings {

    //https://leetcode.com/contest/biweekly-contest-167/problems/equal-score-substrings/
    public boolean scoreBalance(String s) {

        int n = s.length();

        for(int i=0 ; i<n; i++){
            int score = 0;

            for(int j=0 ; j<=i ; j++){
                score += ((s.charAt(j) - 'a') + 1);
            }

            for(int j = i+1; j<n ; j++){
                score -= ((s.charAt(j) - 'a') + 1);
            }

            if(score == 0){
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {

    }
}
