package ProblemsDay_235;

import ProblemsDay_25.TreeNode;

public class LowestCommonAncestorofBinaryTree {

    //https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null || p==root || q == root){
            return root;
        }


        TreeNode left = lowestCommonAncestor(root.left, p,q);
        TreeNode right = lowestCommonAncestor(root.right, p,q);

        if(left == null){
            return right;
        }else if(right == null){
            return left;
        }else {
            return root;
        }

    }
    public static void main(String[] args) {

    }
}
