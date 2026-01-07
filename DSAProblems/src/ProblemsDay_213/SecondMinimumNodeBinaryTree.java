package ProblemsDay_213;

import ProblemsDay_25.TreeNode;

public class SecondMinimumNodeBinaryTree {
//https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/?envType=problem-list-v2&envId=depth-first-search
    private int rootVal;
    private long ans;

    public int findSecondMinimumValue(TreeNode root) {
        // Initialize the smallest value and answer
        rootVal = root.val;
        ans = Long.MAX_VALUE;

        // Traverse the tree to find the second minimum
        dfs(root);

        // If ans was never updated, return -1
        return (ans == Long.MAX_VALUE) ? -1 : (int) ans;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;

        // If we find a value strictly between rootVal and current ans, update ans
        if (node.val > rootVal && node.val < ans) {
            ans = node.val;
        }
        // If this node equals the minimum, we need to explore its children
        else if (node.val == rootVal) {
            dfs(node.left);
            dfs(node.right);
        }
    }

    public static void main(String[] args) {

    }
}
