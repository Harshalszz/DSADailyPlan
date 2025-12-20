package ProblemsDay_195;

import java.util.ArrayList;
import java.util.List;

public class AmbiguousCoordinates {
//https://leetcode.com/problems/ambiguous-coordinates/?envType=problem-list-v2&envId=string
    List<String> ans = new ArrayList<>();

    public List<String> ambiguousCoordinates(String s) { // main function

        s = s.substring(1,s.length()-1);

        for(int i=1;i<s.length();i++)
            solve(s.substring(0,i),s.substring(i));

        return ans;
    }

    public void solve(String left,String right) { // this functions tries to form all pairs of x,y coordinates

        List<String> left_dots = convert(left);
        List<String> right_dots = convert(right);

        for(String left_part_dot : left_dots) {
            if(isValid(left_part_dot)) {

                for(String right_part_dot : right_dots ) {

                    if(isValid(right_part_dot)) {

                        ans.add("(" + left_part_dot + ", " + right_part_dot + ")");

                    }
                }
            }
        }
    }

    public List<String> convert(String s) { // this method just keeps dots at n-1 places

        List<String> tmp = new ArrayList<>();
        tmp.add(s);

        for(int i=1;i<s.length();i++) {
            tmp.add(s.substring(0,i) + "." + s.substring(i));
        }

        return tmp;
    }

    public boolean isValid(String s) { // this method checks if the formed dot is valid or not.

        if(s.contains(".")) {

            String []part = s.split("\\.");

            if(!part[0].equals("0") && part[0].startsWith("0")) return false;

            else return !part[1].endsWith("0");

        }
        else {

            if(s.equals("0")) return true;

            else return !s.startsWith("0");

        }
    }

    public static void main(String[] args) {

    }
}
