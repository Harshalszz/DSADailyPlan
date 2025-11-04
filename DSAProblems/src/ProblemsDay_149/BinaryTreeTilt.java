package ProblemsDay_149;

import ProblemsDay_25.TreeNode;

public class BinaryTreeTilt {
//https://leetcode.com/problems/binary-tree-tilt/?envType=problem-list-v2&envId=depth-first-search
    private int sum = 0;

    public int find(TreeNode root) {
        if (root == null)
            return 0;
        int left = find(root.left);
        int right = find(root.right);
        sum += Math.abs(left - right);
        return root.val + left + right;
    }

    public int findTilt(TreeNode root) {
        find(root);
        return sum;
    }

    public static void main(String[] args) {

    }
}
