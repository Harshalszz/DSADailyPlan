package ProblemsDay_230;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {

    //https://leetcode.com/problems/destination-city/?envType=problem-list-v2&envId=string
    public String destCity(List<List<String>> paths) {
        Set<String> cities = new HashSet<>();
        for (List<String> path : paths) {
            cities.add(path.get(0));
        }

        for (List<String> path : paths) {
            String dest = path.get(1);
            if (!cities.contains(dest)) {
                return dest;
            }
        }
        return "";
    }
    public static void main(String[] args) {

    }
}
