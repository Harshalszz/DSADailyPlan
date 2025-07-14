package ProblemsDay_38;

import ProblemsDay_25.TreeNode;

public class MinimumAbsoluteDifferenceBST {
    //https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/

    int ans = Integer.MAX_VALUE;
    TreeNode pre = null;
    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return ans;
    }

    public void inOrder(TreeNode root)
    {
        if(root ==  null)return;
        inOrder(root.left);
        if(pre != null){
            ans = Math.min(ans, root.val - pre.val);
        }
        pre= root;
        inOrder(root.right);
    }

    public static void main(String[] args) {

    }
}
