package ProblemsDay_227;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {

    //https://leetcode.com/problems/print-words-vertically/?envType=problem-list-v2&envId=string
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int n = 0;
        for (String w : words) {
            n = Math.max(n, w.length());
        }
        List<String> result = new ArrayList<>();

        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (String w : words) {
                if (j < w.length()) sb.append(w.charAt(j));
                else sb.append(" ");
            }
            // Remove trailing spaces
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ')
                sb.setLength(sb.length() - 1);
            result.add(sb.toString());
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
