package ProblemsDay_195;

import java.util.ArrayList;
import java.util.List;

public class DivideStringIntoGroupsofSizek {

    //https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/
    public String[] divideString(String s, int k, char fill) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (sb.length() == k) {
                result.add(sb.toString());
                sb.setLength(0); // clear the StringBuilder
            }
        }

        if (sb.length() != 0) {
            while (sb.length() < k) {
                sb.append(fill);
            }
            result.add(sb.toString());
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {

    }
}
