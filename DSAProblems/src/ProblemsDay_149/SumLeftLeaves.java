package ProblemsDay_149;

import ProblemsDay_25.TreeNode;

public class SumLeftLeaves {

    //https://leetcode.com/problems/sum-of-left-leaves/?envType=problem-list-v2&envId=depth-first-search
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }

    private int dfs(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) { // Leaf node
            return isLeft ? node.val : 0;
        }
        int leftSum = dfs(node.left, true);   // Traverse left child
        int rightSum = dfs(node.right, false); // Traverse right child
        return leftSum + rightSum;
    }
    public static void main(String[] args) {

    }
}
