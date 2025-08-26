package ProblemsDay_81;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> jewelSet = new HashSet<>();

        for(char ch : jewels.toCharArray()){
            jewelSet.add(ch);
        }

        int res= 0 ;

        for(char ch : stones.toCharArray()){
            if(jewelSet.contains(ch)){
                res++;
            }
        }

        return res;


    }

    public static void main(String[] args) {

    }
}
