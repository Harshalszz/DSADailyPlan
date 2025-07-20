package ProblemsDay_44;

import ProblemsDay_25.TreeNode;

public class TrimBinarySearchTree {

    //https://leetcode.com/problems/trim-a-binary-search-tree/

    public TreeNode trimBST(TreeNode root, int low, int high) {

        if(root == null){
            return null;
        }

        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right, low,high);

        if(root.val < low){
            return root.right;
        }

        if(root.val > high){
            return root.left;
        }

        return root;

    }

    public static void main(String[] args) {

    }
}
