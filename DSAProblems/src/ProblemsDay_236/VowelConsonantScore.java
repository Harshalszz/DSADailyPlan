package ProblemsDay_236;

public class VowelConsonantScore {

    //https://leetcode.com/problems/vowel-consonant-score/
    public int vowelConsonantScore(String s) {

        int count=0;
        String vowels="aeiou";
        int con=0;
        for(char ch:s.toCharArray()){
            if (vowels.indexOf(ch)!=-1){
                count++;
                continue;
            }
            if(Character.isAlphabetic(ch)){
                con++;
            }
        }
        return con==0?0:count/con;

    }
    public static void main(String[] args) {

    }
}
