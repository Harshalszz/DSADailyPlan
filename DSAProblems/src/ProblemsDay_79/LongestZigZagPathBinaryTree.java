package ProblemsDay_79;

import ProblemsDay_25.TreeNode;

public class LongestZigZagPathBinaryTree {

    //https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/?envType=study-plan-v2&envId=leetcode-75

    int ans = 0;
    public int longestZigZag(TreeNode root) {

        if(root == null){
            return 0;
        }

        helper(root.left, 1, false); // false as next node eill be right for zizag
        helper(root.right, 1, true);

        return ans;

    }

    public void helper( TreeNode node, int count, boolean isNextLeftNode){

        if(node == null){
            return;
        }

        ans = Math.max(ans,count);

        if(isNextLeftNode){
            helper(node.left, count+1, false);
            helper(node.right, 1, true); // reseting the count as zizag patten is not followed
        }else{
            helper(node.right, count+1 , true);
            helper(node.left, 1, false);
        }
    }

    public static void main(String[] args) {

    }
}
