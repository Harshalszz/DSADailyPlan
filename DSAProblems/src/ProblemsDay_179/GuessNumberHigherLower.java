package ProblemsDay_179;

public class GuessNumberHigherLower {
//https://leetcode.com/problems/guess-number-higher-or-lower/
    public int guessNumber(int n) {
        int low=1, high=n ;
        while(low<= high){
            int mid= low+ (high-low)/2;
            if(guess(mid)== -1) high= mid-1; // Picked number is smaller than mid

            else if(guess(mid)== 1) low= mid+1;  // Picked number is larger than mid

            else return mid; // Found the picked number

        }
        return n; // This line should normally never be reached

    }

    private int guess(int mid) {
        return 1;
    }

    public static void main(String[] args) {

    }
}
