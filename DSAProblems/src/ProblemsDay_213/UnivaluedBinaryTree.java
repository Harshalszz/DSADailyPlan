package ProblemsDay_213;

import ProblemsDay_25.TreeNode;

public class UnivaluedBinaryTree {

    //https://leetcode.com/problems/univalued-binary-tree/?envType=problem-list-v2&envId=depth-first-search
    public boolean isUnivalTree(TreeNode root) {
        if (root == null)
            return true;
        if (root.left != null)
            if (root.val != root.left.val)
                return false;
        if (root.right != null)
            if (root.val != root.right.val)
                return false;
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
    public static void main(String[] args) {

    }
}
