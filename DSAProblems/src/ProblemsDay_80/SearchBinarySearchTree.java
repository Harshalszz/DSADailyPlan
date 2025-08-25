package ProblemsDay_80;

import ProblemsDay_25.TreeNode;

public class SearchBinarySearchTree {

    //https://leetcode.com/problems/search-in-a-binary-search-tree/?envType=study-plan-v2&envId=leetcode-75

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }

        if(root.val == val){
            return root;
        }

        if(root.val < val){
            return searchBST(root.right, val);
        }else{
            return searchBST(root.left, val);
        }

    }

    public static void main(String[] args) {

    }
}
