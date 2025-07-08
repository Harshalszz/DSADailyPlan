package ProblemsDay_32;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {

    //https://leetcode.com/problems/binary-tree-right-side-view/
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> resList = new ArrayList<>();

        travels(root,resList,0);

        return resList;

    }

    public static void travels(TreeNode node, List<Integer> resList, int depth){

        if(node == null) {
            return;
        }
        // if the level == size of the resList then add it
        if(depth == resList.size()){
            resList.add(node.val);
        }

        //we are doing reverse preorder traversal for right view
        //and for left view start from left first then right
        travels(node.right, resList, depth +1);
        travels(node.left, resList, depth+1);
    }

    public static void main(String[] args) {

    }
}
