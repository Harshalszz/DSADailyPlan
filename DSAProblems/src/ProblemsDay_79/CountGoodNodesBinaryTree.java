package ProblemsDay_79;

import ProblemsDay_25.TreeNode;

public class CountGoodNodesBinaryTree {
    //https://leetcode.com/problems/count-good-nodes-in-binary-tree/?envType=study-plan-v2&envId=leetcode-75

    public int goodNodes(TreeNode root) {

        return helper(root, Integer.MIN_VALUE);

    }

    private int helper(TreeNode node, int maxValue){

        if(node == null){
            return 0;
        }

        int countGood = 0;

        if(node.val>=maxValue){
            maxValue = node.val;
            countGood++;
        }

        return countGood + helper(node.left, maxValue) + helper(node.right, maxValue);

    }

    public static void main(String[] args) {

    }
}
