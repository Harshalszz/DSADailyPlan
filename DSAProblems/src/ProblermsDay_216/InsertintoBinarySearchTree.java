package ProblermsDay_216;

import ProblemsDay_25.TreeNode;

public class InsertintoBinarySearchTree {

    //https://leetcode.com/problems/insert-into-a-binary-search-tree/?envType=problem-list-v2&envId=binary-tree
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        TreeNode curr = root;
        while (true) {
            if (curr.val <= val) {
                if (curr.right != null) {
                    curr = curr.right;
                } else {
                    curr.right = new TreeNode(val);
                    break;
                }
            } else {
                if (curr.left != null) {
                    curr = curr.left;
                } else {
                    curr.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
    public static void main(String[] args) {

    }
}
