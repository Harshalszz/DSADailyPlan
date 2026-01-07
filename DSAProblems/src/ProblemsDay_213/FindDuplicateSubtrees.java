package ProblemsDay_213;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateSubtrees {
//https://leetcode.com/problems/find-duplicate-subtrees/?envType=problem-list-v2&envId=depth-first-search
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> map = new HashMap<>();
        List<TreeNode> arr = new ArrayList<>();

        getSubTreesString(root, map, arr);

        return arr;
    }

    private String getSubTreesString( TreeNode root, Map<String, Integer> map, List<TreeNode> arr ) {
        if( root == null ) return null;

        String left = getSubTreesString( root.left, map, arr );
        String right = getSubTreesString( root.right, map, arr );

        String subTree = root.val + "," + left +"," + right;

        int count = map.getOrDefault(subTree, 0);
        if( count == 1 ) {
            arr.add(root);
        }

        map.put( subTree, count + 1 );

        return subTree;
    }
    public static void main(String[] args) {

    }
}
