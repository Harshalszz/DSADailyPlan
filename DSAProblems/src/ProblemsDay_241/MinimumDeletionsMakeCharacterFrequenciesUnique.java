package ProblemsDay_241;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumDeletionsMakeCharacterFrequenciesUnique {
//https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/?envType=problem-list-v2&envId=string
    public int minDeletions(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        int n = freqMap.size();
        int idx = 0, cnt = 0;
        int[] freq = new int[n];
        for (int val : freqMap.values()) {
            freq[idx++] = val;
        }
        for (int i = 0; i < n / 2; i++) {
            int temp = freq[i];
            freq[i] = freq[n - i - 1];
            freq[n - i - 1] = temp;
        }
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!st.contains(freq[i])) {
                st.add(freq[i]);
            } else {
                while (st.contains(freq[i])) {
                    freq[i]--;
                    cnt++;
                }
                if (freq[i] > 0) {
                    st.add(freq[i]);
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {

    }
}
