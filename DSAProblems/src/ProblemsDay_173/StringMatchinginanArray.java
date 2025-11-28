package ProblemsDay_173;

import java.util.ArrayList;
import java.util.List;

public class StringMatchinginanArray {

    //https://leetcode.com/problems/string-matching-in-an-array/?envType=problem-list-v2&envId=string-matching
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i != j && words[j].contains(words[i])) {
                    ans.add(words[i]);
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
