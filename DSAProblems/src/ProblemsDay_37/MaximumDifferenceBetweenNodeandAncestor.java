package ProblemsDay_37;

import ProblemsDay_25.TreeNode;

public class MaximumDifferenceBetweenNodeandAncestor {
    //https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/

    public int diff = 0;
    public int maxAncestorDiff(TreeNode root) {
        if(root == null){
            return 0;
        }

        dfs(root, Integer.MAX_VALUE,Integer.MIN_VALUE);

        return diff;
    }

    public void dfs(TreeNode node, int minValue, int maxValue){

        if(node == null){
            return;
        }
        // finding the max vale and min value from the tree
        minValue = Math.min(minValue, node.val);
        maxValue = Math.max(maxValue, node.val);
        // then finding the maximum difference
        diff = Math.max(diff, Math.abs(maxValue- minValue));

        dfs(node.left,minValue, maxValue);
        dfs(node.right, minValue,maxValue);
    }

    public static void main(String[] args) {

    }
}
