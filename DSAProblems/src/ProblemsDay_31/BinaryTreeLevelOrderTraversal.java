package ProblemsDay_31;

import ProblemsDay_25.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
//https://leetcode.com/problems/binary-tree-level-order-traversal/
    public static List<List<Integer>> binaryTreeLevelOrderTraversal(TreeNode root){

        List<List<Integer>> resList = new ArrayList<>();

        if(root == null){
            return resList;
        }
        // maintnaing a queue to insert the root value
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){

            List<Integer> temp = new ArrayList<>();

            int n = queue.size();

            for (int i = 0; i < n; i++) {

                TreeNode node = queue.poll();
                temp.add(node.val);
                //if the node has left and right child then again added theme inot the queue

                if(node.left != null){
                    queue.add(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }

            }
            resList.add(temp);
        }

        return resList;

    }

    public static void main(String[] args) {

    }
}
