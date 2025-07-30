package ProblemsDay_54;

public class FindIndexofFirstOccurrenceString {

    //https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

    public static int strStr(String haystack, String needle) {

        if(haystack.length() < needle.length()){
            return -1;
        }

        for(int i=0; i<=haystack.length() -needle.length() ; i++ ){

            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(strStr(haystack,needle));

    }
}
