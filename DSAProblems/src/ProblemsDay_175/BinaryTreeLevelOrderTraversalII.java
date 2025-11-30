package ProblemsDay_175;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> result=new ArrayList<>();
            if(root==null)return result;
            Queue<TreeNode> queue=new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                int levelsize=queue.size();
                List<Integer> curList=new ArrayList<>();
                for(int i=0;i<levelsize;i++){
                    TreeNode cnode=queue.poll();
                    curList.add(cnode.val);
                    if(cnode.left!=null)queue.offer(cnode.left);
                    if(cnode.right!=null)queue.offer(cnode.right);
                }
                result.add(0,curList);
            }
            return result;
        }
    }
    public static void main(String[] args) {

    }
}
