package ProblemsDay_33;

public class MaximumWidthBinaryTree {
//https://leetcode.com/problems/maximum-width-of-binary-tree/
//    public int widthOfBinaryTree(TreeNode root) {
//
////        if (root == null) return 0;
////
////        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
////        queue.add(new Pair<>(root, 0));
////        int maxWidth = 0;
////
////        while (!queue.isEmpty()) {
////            int levelLength = queue.size();
////            int levelStart = queue.peek().getValue();
////            int index = 0;
////
////            for (int i = 0; i < levelLength; i++) {
////                Pair<TreeNode, Integer> pair = queue.poll();
////                TreeNode node = new TreeNode(0);
////                index = pair.getValue();
////
////                if (node.left != null) {
////                    queue.add(new Pair<>(node.left, 2*index));
////                }
////
////                if (node.right != null) {
////                    queue.add(new Pair<>(node.right, 2*index+1));
////                }
////            }
////
////            maxWidth = Math.max(maxWidth, index - levelStart + 1);
////        }
////
////        return maxWidth;
//
//    }

    public static void main(String[] args) {

    }
}
