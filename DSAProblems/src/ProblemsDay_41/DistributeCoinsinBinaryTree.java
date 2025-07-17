package ProblemsDay_41;

import ProblemsDay_25.TreeNode;

public class DistributeCoinsinBinaryTree {

    //https://leetcode.com/problems/distribute-coins-in-binary-tree/

    public int ans;
    public int distributeCoins(TreeNode root) {
        ans = 0;
        countSteps(root);
        return ans;
    }
    public int countSteps(TreeNode root) {
        if (root == null) return 0;
        int leftCoins = countSteps(root.left);
        int rightCoins = countSteps(root.right);
        ans += Math.abs(leftCoins) + Math.abs(rightCoins);
        return (root.val - 1) + leftCoins + rightCoins;
    }

    public static void main(String[] args) {

    }
}
