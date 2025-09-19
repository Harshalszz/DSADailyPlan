package ProblemsDay_105;

import ProblemsDay_25.TreeNode;

import java.util.Stack;

public class BinarySearchTreeIterator {
    //https://leetcode.com/problems/binary-search-tree-iterator/?envType=study-plan-v2&envId=top-interview-150

    class BSTIterator {

        //In order travels

        Stack<TreeNode> stack = new Stack<>();

        public void pushAll(TreeNode node){
            for(; node != null ; stack.push(node), node= node.left);
        }

        public BSTIterator(TreeNode root) {

            pushAll(root);

        }

        public int next() {

            TreeNode node = stack.pop();
            pushAll(node.right);
            return node.val;

        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }

    public static void main(String[] args) {

    }
}
