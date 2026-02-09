package ProblemsDay_246;

public class IncreasingDecreasing {
//https://leetcode.com/problems/increasing-decreasing-string/?envType=problem-list-v2&envId=string
    public String sortString(String s) {
        int[]freq=new int[26];
        int max=0;
        for(char c:s.toCharArray()){
            freq[c-'a']++;
            if(freq[c-'a']>max)max=freq[c-'a'];
        }
        StringBuilder sb=new StringBuilder();
        while(max-->0){
            for(int i=0;i<26;i++){
                if(freq[i]>0){
                    sb.append((char)('a'+i));
                    freq[i]--;
                }
            }
            for(int i=25;i>=0;i--){
                if(freq[i]>0){
                    sb.append((char)('a'+i));
                    freq[i]--;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

    }
}
