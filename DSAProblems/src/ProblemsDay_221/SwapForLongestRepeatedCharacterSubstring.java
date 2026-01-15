package ProblemsDay_221;

public class SwapForLongestRepeatedCharacterSubstring {

    //https://leetcode.com/problems/swap-for-longest-repeated-character-substring/?envType=problem-list-v2&envId=string
    public int maxRepOpt1(String text) {
        int arr [] = new int [26];
        for(int a=0;a<text.length();a++){
            arr[text.charAt(a)-'a']++;
        }
        int i=0;
        int len=0;
        int n = text.length();
        while(i<n){
            int j=i;
            while(j<n&&text.charAt(j)==text.charAt(i)){
                ++j;
            }
            int block1 = j-i;
            int k = j+1;
            while(k<n&&text.charAt(k)==text.charAt(i)){
                ++k;
            }
            int block2 = k-j-1;
            len = Math.max(len,Math.min(block1+block2+1,arr[text.charAt(i)-'a']));
            i=j;
        }
        return len;
    }
    public static void main(String[] args) {

    }
}
