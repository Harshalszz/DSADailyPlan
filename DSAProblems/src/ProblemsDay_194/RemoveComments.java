package ProblemsDay_194;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveComments {
//https://leetcode.com/problems/remove-comments/?envType=problem-list-v2&envId=string
    public List<String> removeComments(String[] source) {
        String program = String.join("\n", source);
        List<String> ans = new ArrayList<>(List.of(program.replaceAll("//.*|/\\*(.|\n)*?\\*/", "").split("\n")));
        ans.removeAll(Collections.singleton(""));
        return ans;
    }

    public static void main(String[] args) {

    }
}
