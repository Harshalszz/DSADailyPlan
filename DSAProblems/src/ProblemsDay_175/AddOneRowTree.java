package ProblemsDay_175;

import ProblemsDay_25.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class AddOneRowTree {
    //https://leetcode.com/problems/add-one-row-to-tree/?envType=problem-list-v2&envId=breadth-first-search
    class Solution {
        public TreeNode addOneRow(TreeNode root, int val, int depth) {
            if (depth == 1) {
                TreeNode newRoot = new TreeNode(val);
                newRoot.left = root;
                return newRoot;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int currentDepth = 0;

            while (!queue.isEmpty()) {
                int size = queue.size();
                currentDepth++;

                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();

                    if (currentDepth + 1 == depth) {
                        TreeNode newLeft = new TreeNode(val);
                        newLeft.left = node.left;
                        node.left = newLeft;

                        TreeNode newRight = new TreeNode(val);
                        newRight.right = node.right;
                        node.right = newRight;
                    } else {
                        if (node.left != null) queue.offer(node.left);
                        if (node.right != null) queue.offer(node.right);
                    }
                }
            }

            return root;
        }
    }
    public static void main(String[] args) {

    }
}
