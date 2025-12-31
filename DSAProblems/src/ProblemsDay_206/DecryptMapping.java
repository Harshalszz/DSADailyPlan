package ProblemsDay_206;

public class DecryptMapping {
//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/?envType=problem-list-v2&envId=string

    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;


        while( i >= 0) {
            if(s.charAt(i) == '#') {
                sb.append((char) ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') + 96));
                i -= 3;
            } else {
                sb.append((char) ((s.charAt(i) - '0') + 96));
                i--;
            }
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {

    }
}
