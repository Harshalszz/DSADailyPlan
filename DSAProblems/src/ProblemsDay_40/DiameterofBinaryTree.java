package ProblemsDay_40;

import ProblemsDay_25.TreeNode;

public class DiameterofBinaryTree {
    //https://leetcode.com/problems/diameter-of-binary-tree/

    public int diameterOfBinaryTree(TreeNode root) {

        int[] res = new int[1]; // Creating array so that we can pass by reference, since pass by value doesn't work in Java.
        findDiameter(root, res); // Recursive call
        return res[0];

    }

    private int findDiameter(TreeNode node, int[] res) {
        if (node == null)
            return 0; // Edge case

        int lh = findDiameter(node.left, res); // Calculate left subtree
        int rh = findDiameter(node.right, res); // Calculate right subtree

        res[0] = Math.max(res[0], lh + rh); // Calculating max diameter for this recursive call
        return 1 + Math.max(lh, rh); // Returning the height for the next recursive call
    }

    public static void main(String[] args) {

    }
}
