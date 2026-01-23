package ProblemsDay_229;

import ProblemsDay_25.TreeNode;

public class BinarySearchTreeGreaterSumTree {
//https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/?envType=problem-list-v2&envId=tree
    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root != null) {
            bstToGst(root.right);  // Traverse the right subtree
            sum += root.val;  // Update the sum
            root.val = sum;  // Update the current node's value
            bstToGst(root.left);  // Traverse the left subtree
        }
        return root;
    }
    public static void main(String[] args) {

    }
}
