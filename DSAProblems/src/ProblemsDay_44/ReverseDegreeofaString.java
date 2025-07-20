package ProblemsDay_44;

public class ReverseDegreeofaString {
    //https://leetcode.com/problems/reverse-degree-of-a-string/

    public static int reverseDegree(String s) {

        int res = 0;
        int index = 1;
        for(int i =0 ; i<s.length(); i++){
            int charNum = 'z' - s.charAt(i) + 1;
            res += charNum * index;
            index++;
        }

        return res;

    }

    public static void main(String[] args) {

        String s = "zaza";
        System.out.println(reverseDegree(s));

    }
}
