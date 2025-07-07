package ProblemsDay_31;

import ProblemsDay9.TrappingRainWater;
import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinimumDepthofBinaryTree {
//https://leetcode.com/problems/minimum-depth-of-binary-tree/

    //bfs approch
    public static int minimumDepthofBinaryTree(TreeNode root){

        //List<List<Integer>> resList = new ArrayList<>();

        if(root == null){
            return 0;
        }
        // maintnaing a queue to insert the root value
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        int depth = 1;

        while(!queue.isEmpty()){

            //List<Integer> temp = new ArrayList<>();

            int n = queue.size();

            for (int i = 0; i < n; i++) {

                TreeNode node = queue.poll();
                //temp.add(node.val);
                //if the node has left and right child then again added theme inot the queue

                if(node.left == null && node.right == null){
                    return depth;
                }

                if(node.left != null){
                    queue.add(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }

            }
            depth++;
        }

        return 0;

    }
    //dfs
    public static int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if(left == 0 || right == 0){
            return 1+ left+right;
        }

        return 1+ Math.min(left,right);
    }

    public static void main(String[] args) {

    }
}
