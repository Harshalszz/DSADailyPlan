package ProblemsDay_240;

public class LargestEvenNumber {
//https://leetcode.com/problems/largest-even-number/
    public String largestEven(String s) {
        int i;
        for(i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '2') break;
        }
        return s.substring(0, i + 1);
    }
    public static void main(String[] args) {

    }
}
