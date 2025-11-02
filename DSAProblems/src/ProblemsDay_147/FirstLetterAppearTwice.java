package ProblemsDay_147;

public class FirstLetterAppearTwice {

    //https://leetcode.com/problems/first-letter-to-appear-twice/
    public char repeatedCharacter(String s) {
        int [] st= new int [26];
        for(char c: s.toCharArray()){
            st[c-97]++;
            if(st[c-97]==2)return c;
        }
        return '\0';
    }
    public static void main(String[] args) {

    }
}
