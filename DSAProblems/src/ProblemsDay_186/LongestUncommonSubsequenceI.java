package ProblemsDay_186;

public class LongestUncommonSubsequenceI {
//https://leetcode.com/problems/longest-uncommon-subsequence-i/?envType=problem-list-v2&envId=string
    public int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;
        return Math.max(a.length(), b.length());
    }
    public static void main(String[] args) {

    }
}
