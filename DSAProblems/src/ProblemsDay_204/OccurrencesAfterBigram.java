package ProblemsDay_204;

import java.util.ArrayList;
import java.util.List;

public class OccurrencesAfterBigram {
//https://leetcode.com/problems/occurrences-after-bigram/?envType=problem-list-v2&envId=string
    public String[] findOcurrences(String text, String first, String second) {
        String[] textArray = text.split(" ");
        List<String> res = new ArrayList<>();

        for(int i = 0; i < textArray.length - 2; i++){
            if(textArray[i].equals(first) && textArray[i+1].equals(second)){
                res.add(textArray[i+2]);
            }
        }

        String[] result = new String[res.size()];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
