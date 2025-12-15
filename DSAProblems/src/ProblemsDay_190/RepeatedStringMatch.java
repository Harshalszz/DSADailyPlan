package ProblemsDay_190;

public class RepeatedStringMatch {
//https://leetcode.com/problems/repeated-string-match/?envType=problem-list-v2&envId=string
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        while(sb.length() < b.length()){
            sb.append(a);
            count++;
        }

        if(sb.indexOf(b) != -1){
            return count;
        }

        sb.append(a);
        count++;
        if(sb.indexOf(b) != -1){
            return count;
        }

        return -1;
    }
    public static void main(String[] args) {

    }
}
