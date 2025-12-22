package ProblemsDay_197;

public class FlipStringtoMonotoneIncreasing {
//https://leetcode.com/problems/flip-string-to-monotone-increasing/?envType=problem-list-v2&envId=string
    public int minFlipsMonoIncr(String s) {
        int zeroes = 0;
        int ones = 0;

        // First pass: count total zeroes
        for(char ch : s.toCharArray()){
            if(ch == '0'){
                zeroes++;
            }
        }

        int output = zeroes; // Initialize with flipping all zeroes to ones

        // Second pass: find minimum flips needed
        for(char ch : s.toCharArray()){
            if(ch == '0'){
                zeroes--; // One less zero to flip if we include this position in prefix
            }
            else if(ch == '1'){
                ones++; // Need to flip this one to zero if in prefix
            }
            output = Math.min(output, zeroes+ones);
        }

        return output;
    }

    public static void main(String[] args) {

    }
}
