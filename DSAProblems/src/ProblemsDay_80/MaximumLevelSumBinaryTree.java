package ProblemsDay_80;

import ProblemsDay_25.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumBinaryTree {
    //https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/?envType=study-plan-v2&envId=leetcode-75
    //Used BFS

    public int maxLevelSum(TreeNode root) {

        int max = Integer.MIN_VALUE, maxLevel = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        for (int level = 1; !q.isEmpty(); ++level) {
            int sum = 0;
            for (int sz = q.size(); sz > 0; --sz) {
                TreeNode n = q.poll();
                sum += n.val;
                if (n.left != null) {
                    q.offer(n.left);
                }
                if (n.right != null) {
                    q.offer(n.right);
                }
            }
            if (max < sum) {
                max = sum;
                maxLevel = level;
            }
        }
        return maxLevel;

    }

    public static void main(String[] args) {

    }
}
