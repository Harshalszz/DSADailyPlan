package ProblemsDay_31;

import ProblemsDay_25.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthBinaryTree {
//https://leetcode.com/problems/maximum-depth-of-binary-tree/
    public int maxDepth(TreeNode root) {
        // DFS approch
        // if(root == null){
        //     return 0;
        // }

        // int left = maxDepth(root.left);
        // int right = maxDepth(root.right);

        // return 1+ Math.max(left,right);

        // BFS approch

        if(root == null){
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        int res = 0;

        queue.add(root);

        while(!queue.isEmpty()){

            int n = queue.size();

            for(int i=0; i<n; i++){

                TreeNode node = queue.poll();

                if(node.left !=null){
                    queue.add(node.left);
                }

                if(node.right !=null){
                    queue.add(node.right);
                }
            }

            res++;
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
