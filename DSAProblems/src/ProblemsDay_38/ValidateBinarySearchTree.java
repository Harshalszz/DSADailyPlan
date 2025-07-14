package ProblemsDay_38;

import ProblemsDay_25.TreeNode;

public class ValidateBinarySearchTree {
    //https://leetcode.com/problems/validate-binary-search-tree/
    public boolean isValidBST(TreeNode root) {

        return validTree(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    public boolean validTree(TreeNode node, long min,long max){

        if(node == null ){
            return true;
        }

        if(!(node.val>min && node.val < max)){
            return false;
        }


        return validTree(node.left, min, node.val) && validTree(node.right, node.val,max);
    }

    public static void main(String[] args) {

    }
}
