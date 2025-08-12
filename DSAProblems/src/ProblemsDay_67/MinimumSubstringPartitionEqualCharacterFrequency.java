package ProblemsDay_67;

public class MinimumSubstringPartitionEqualCharacterFrequency {
    //https://leetcode.com/problems/minimum-substring-partition-of-equal-character-frequency/
    int MAX = Integer.MAX_VALUE;
    Integer[] dp;
    public int minimumSubstringsInPartition(String s) {
        dp = new Integer[s.length()];
        return dfs(s, 0);
    }

    public int dfs(String s, int index) {
        if(index == s.length()) return  0;
        if (dp[index] != null) return dp[index];

        int min = MAX;

        int[] freq = new int[26];
        for(int j = index; j<s.length(); j++){
            char ch = s.charAt(j);
            freq[ch - 'a']++;
            if(isValid(freq)){
                int breakNew = dfs(s, j+1);
                min = Math.min(min, 1 + breakNew);
            }
        }
        return dp[index] = min;
    }


    public boolean isValid(int[] freq){
        int i =0;
        while(i<freq.length && freq[i] == 0) i++;
        int val = i < freq.length ? freq[i] : -1;
        while(i<freq.length){
            if(freq[i] != 0 && freq[i] != val) return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
