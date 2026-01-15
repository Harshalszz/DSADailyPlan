package ProblemsDay_221;

import java.util.Arrays;

public class CompareStringsFrequencySmallestCharacter {

    //https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/?envType=problem-list-v2&envId=string
    int findfreq(String word) {
        char smallest = 'z';
        int c = 0;
        for(char ch:word.toCharArray()) {
            if(ch<smallest) {
                smallest = ch;
            }
        }
        for(char ch:word.toCharArray()) {
            if(ch==smallest) {
                c++;
            }
        }
        return c;
    }
    int findceil(int[] a, int c) {
        int low = 0, high = a.length-1;
        int ans = -1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(a[mid]>c) {
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int n = queries.length, m = words.length;
        int[] ans = new int[n];
        int[] a = new int[m];
        for(int i=0;i<m;i++) {
            a[i]= findfreq(words[i]);
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++) {
            int c = findfreq(queries[i]);
            int ceil = findceil(a,c);
            ans[i] = (ceil==-1)?0:m-ceil;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
