package ProblemsDay_75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberofOccurrences {
    //https://leetcode.com/problems/unique-number-of-occurrences/?envType=study-plan-v2&envId=leetcode-75

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int n : arr){
            freqMap.put(n,freqMap.getOrDefault(n,0)+1);
        }

        Set<Integer> setFreq = new HashSet<>();

        for(int num: freqMap.values()){
            setFreq.add(num);
        }

        return freqMap.size() == setFreq.size();


    }

    public static void main(String[] args) {

    }
}
