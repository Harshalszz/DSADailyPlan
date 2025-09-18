package ProblemsDay_104;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelsBinaryTree {
    //https://leetcode.com/problems/average-of-levels-in-binary-tree/?envType=study-plan-v2&envId=top-interview-150

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>list = new ArrayList<>();
        if(root==null){
            return list;
        }
        helper(root,list);
        return list;
    }
    public void helper(TreeNode root, List<Double>list){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Double sum = 0.0;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode n = q.poll();
                sum+=n.val;
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
            }
            list.add(sum/size);
        }
    }

    public static void main(String[] args) {

    }
}
