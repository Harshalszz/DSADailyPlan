package ProblemsDay_79;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {

    //https://leetcode.com/problems/leaf-similar-trees/?envType=study-plan-v2&envId=leetcode-75

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> leaveNodes1 = new ArrayList<>();
        List<Integer> leaveNodes2 = new ArrayList<>();

        collectLeave(root1, leaveNodes1);
        collectLeave(root2, leaveNodes2);

        return leaveNodes1.equals(leaveNodes2);



    }

    public void collectLeave(TreeNode node , List<Integer> leaves){

        if(node == null){
            return;
        }

        if(node.left == null && node.right == null){
            leaves.add(node.val);
        }

        collectLeave(node.left, leaves);
        collectLeave(node.right, leaves);

    }

    public static void main(String[] args) {

    }
}
