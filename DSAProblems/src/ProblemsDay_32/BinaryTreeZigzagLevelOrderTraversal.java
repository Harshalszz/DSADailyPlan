package ProblemsDay_32;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> resList = new ArrayList<>();

        if(root == null){
            return resList;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        boolean flag = true;

        while(!queue.isEmpty()){

            //List<Integer> temp = new ArrayList<>();
            // instead of list using linkedlist as we need to insert the result first last
            LinkedList<Integer> temp = new LinkedList<>();
            int n = queue.size();

            for(int i=0; i<n;i++){
                TreeNode node = queue.poll();

                if(flag){
                    temp.addLast(node.val);
                }else{
                    temp.addFirst(node.val);
                }

                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);

            }

            resList.add(temp);
            flag = !flag;
        }


        return resList;

    }
    public static void main(String[] args) {

    }
}
