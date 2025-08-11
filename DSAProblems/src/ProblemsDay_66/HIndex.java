package ProblemsDay_66;

import java.util.Arrays;

public class HIndex {
    //https://leetcode.com/problems/h-index/


    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h_index = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] > h_index)
                h_index++;
            else
                break;
        }
        return h_index;
    }

    public static void main(String[] args) {

    }
}
