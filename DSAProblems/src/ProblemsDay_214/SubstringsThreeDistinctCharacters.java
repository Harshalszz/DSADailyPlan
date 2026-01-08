package ProblemsDay_214;

public class SubstringsThreeDistinctCharacters {

    //https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/?envType=problem-list-v2&envId=sliding-window
    public int countGoodSubstrings(String s) {
        int count =0;
        for(int i=0 ; i<= s.length()-3 ; i++){
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            char c = s.charAt(i+2);

            if(a!=b && b!=c && c!=a){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
