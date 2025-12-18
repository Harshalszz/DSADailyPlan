package ProblemsDay_193;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {
//https://leetcode.com/problems/subdomain-visit-count/?envType=problem-list-v2&envId=string
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();

        for (String domainCount : cpdomains) {
            int spaceIndex = domainCount.indexOf(' ');
            int count = Integer.parseInt(domainCount.substring(0, spaceIndex));
            String domain = domainCount.substring(spaceIndex + 1);

            // Process each subdomain
            while (true) {
                map.merge(domain, count, Integer::sum);
                int dotIndex = domain.indexOf('.');
                if (dotIndex == -1) break;
                domain = domain.substring(dotIndex + 1);
            }
        }

        List<String> result = new ArrayList<>(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
