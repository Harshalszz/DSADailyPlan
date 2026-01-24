package ProblemsDay_230;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SimplifiedFractions {
//https://leetcode.com/problems/simplified-fractions/?envType=problem-list-v2&envId=string
    public List<String> simplifiedFractions(int n) {
        List<String> result = new ArrayList<>();
        HashSet<Float> seen = new HashSet<>();

        for (int i = 2; i <= n; i++) { // denominator
            for (int j = 1; j < i; j++) { // numerator
                float val = (float) j / i;
                if (!seen.contains(val)) {
                    seen.add(val);
                    result.add(j + "/" + i);
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
