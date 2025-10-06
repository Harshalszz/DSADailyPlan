package ProblemsDay_121;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentSubtreeSum {

    public int[] findFrequentTreeSum(TreeNode root) {

        HashMap<Integer, Integer> map = new HashMap<>();

        dfs(root, map);

        int maxFreq = 0;

        for(int freq : map.values()){
            maxFreq = Math.max(freq, maxFreq);
        }

        List<Integer> res = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxFreq){
                res.add(entry.getKey());
            }
        }

        int[] resArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArray[i] = res.get(i);
        }

        return resArray;

    }

    public int dfs(TreeNode root, HashMap<Integer, Integer> map){

        if(root == null){
            return 0;
        }

        int left = dfs(root.left, map);
        int right = dfs(root.right, map);

        int sum = left + right + root.val;

        map.put(sum, map.getOrDefault(sum,0) + 1);

        return sum;
    }

    public static void main(String[] args) {

    }
}
