package ProblemsDay_73;

public class MaximumNumberVowelsSubstringofGivenLength {
    //https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/?envType=study-plan-v2&envId=leetcode-75

    public int maxVowels(String s, int k) {

        int currVowel = 0;
        for(int i=0; i<k; i++){
            if(isVowels(s.charAt(i))){
                currVowel++;
            }
        }

        int maxVowel = currVowel;

        for(int i=k; i<s.length();i++){

            if(isVowels(s.charAt(i))){
                currVowel++;
            }

            if(isVowels(s.charAt(i-k))){
                currVowel--;
            }

            maxVowel = Math.max(currVowel,maxVowel);
        }

        return maxVowel;

    }

    public boolean isVowels(char c){
        if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
