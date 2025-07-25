package ProblemsDay_35;

import ProblemsDay_25.TreeNode;

public class SymmetricTree {
 //https://leetcode.com/problems/symmetric-tree/

    public boolean isSymmetric(TreeNode root) {

        if (root == null) return true;

        if (root.left == null && root.right == null) return true;
        if (root.left == null || root.right == null) return false;

        return isMirror(root.left, root.right);

    }

    public static boolean isMirror(TreeNode n1, TreeNode n2){

        if(n1 == null && n2 == null){
            return true;
        }

        if(n1 == null || n2 == null){
            return false;
        }

        if (n1.val != n2.val) return false;

        return  isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
    }

    public static void main(String[] args) {

    }
}
