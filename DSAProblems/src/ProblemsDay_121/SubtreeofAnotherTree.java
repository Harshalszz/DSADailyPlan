package ProblemsDay_121;

import ProblemsDay_25.TreeNode;

public class SubtreeofAnotherTree {

    //https://leetcode.com/problems/subtree-of-another-tree/?envType=problem-list-v2&envId=hash-function

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root == null){
            return false;
        }

        if(root.val == subRoot.val){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }


        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    private boolean isIdentical(TreeNode root, TreeNode subRoot){

        if(root == null && subRoot == null){
            return true;
        }

        if(root == null || subRoot == null || root.val != subRoot.val){
            return false;
        }

        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }


    public static void main(String[] args) {

    }
}
