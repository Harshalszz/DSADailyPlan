package ProblemsDay_145;

public class CheckIfStringPrefixofArray {
//https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/?envType=problem-list-v2&envId=two-pointers
    public boolean isPrefixString(String s, String[] words) {
        String str = "";
        for(String st : words){
            str += st;
            if(str.equals(s)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
