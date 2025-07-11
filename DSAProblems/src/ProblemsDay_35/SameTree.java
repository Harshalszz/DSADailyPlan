package ProblemsDay_35;

import ProblemsDay_25.TreeNode;

public class SameTree {

    //https://leetcode.com/problems/same-tree/

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null){
            return true;
        }

        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right,q.right);

    }
    public static void main(String[] args) {

    }
}
