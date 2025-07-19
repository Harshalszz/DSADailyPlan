package ProblemsDay_43;

import ProblemsDay_25.TreeNode;

public class SumRoottoLeafNumbers {

    //https://leetcode.com/problems/sum-root-to-leaf-numbers/description/

    int resSum =0;

    public int sumOfPath(TreeNode root){

        dfsPreOrder(root,0);
        return resSum;
    }

    private void dfsPreOrder(TreeNode node, int path) {

        if(node == null){
            return ;
        }

        path = path*10 + node.val;

        if(node.left == null && node.right == null){
            resSum += path;
        }

        dfsPreOrder(node.left,path);
        dfsPreOrder(node.right, path);
    }

    public static void main(String[] args) {

    }
}
