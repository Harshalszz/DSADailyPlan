package ProblemsDay_43;

import ProblemsDay_25.TreeNode;

public class BinaryTreeMaximumPathSum {

    //https://leetcode.com/problems/binary-tree-maximum-path-sum/

    public int maxPathSum(TreeNode root) {

        int[] maxRes = new int[1];
        maxRes[0] = Integer.MIN_VALUE;
        dfsPostOrder(root,maxRes);
        return maxRes[0];

    }

    public static int dfsPostOrder(TreeNode node, int[] maxRes){

        if(node == null ){
            return 0;
        }

        int left = Math.max(0, dfsPostOrder(node.left, maxRes));
        int right = Math.max(0, dfsPostOrder(node.right, maxRes));

        maxRes[0] = Math.max(maxRes[0], left+right+node.val);

        return node.val + Math.max(left,right);
    }

    public static void main(String[] args) {

    }
}
