package ProblemsDay_210;

import ProblemsDay_25.TreeNode;

public class RangeSumofBST {
//https://leetcode.com/problems/range-sum-of-bst/?envType=problem-list-v2&envId=binary-search-tree
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int currentVal = (root.val >= low && root.val <= high) ? root.val : 0;

        int leftSum = rangeSumBST(root.left, low, high);
        int rightSum = rangeSumBST(root.right, low, high);

        return currentVal + leftSum + rightSum;
    }
    public static void main(String[] args) {

    }
}
