package ProblemsDay_157;

public class MakeNumberofDistinctCharactersEqual {

    //https://leetcode.com/problems/make-number-of-distinct-characters-equal/
    public boolean isItPossible(String word1, String word2) {
        int[] map1 = getFrequency(word1);
        int[] map2 = getFrequency(word2);

        for(int i=0; i< 26; i++){
            if(map1[i] == 0) continue;
            for(int j=0; j< 26; j++){
                if(map2[j] == 0) continue;
//Replace the characters.
                map1[j]++;
                map2[i]++;
                map1[i]--;
                map2[j]--;
                if(condition(map1, map2)) return true;
//If not true retract the changes made.
                map1[j]--;
                map2[i]--;
                map1[i]++;
                map2[j]++;
            }
        }
        return false;
    }
    private int[] getFrequency(String s1){
        int[] map = new int[26];
        for(char c : s1.toCharArray()){
            map[c-'a']++;
        }
        return map;
    }
    private boolean condition(int[] map1, int[] map2){
        int c1 =0, c2 =0;
        for(int i: map1){
            if(i >0) c1++;
        }
        for(int i: map2){
            if(i >0) c2++;
        }
        return c1 == c2;
    }
    public static void main(String[] args) {

    }
}
