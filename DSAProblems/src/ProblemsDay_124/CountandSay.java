package ProblemsDay_124;

public class CountandSay {
//https://leetcode.com/problems/count-and-say/?envType=problem-list-v2&envId=string
    public String countAndSay(int n) {
        if (n == 1) return "1";
        return rle(countAndSay(n - 1));
    }

    private String rle(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        result.append(count).append(s.charAt(s.length() - 1));
        return result.toString();
    }

    public static void main(String[] args) {

    }
}
