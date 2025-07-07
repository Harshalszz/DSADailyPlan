package ProblemsDay_31;

import ProblemsDay_25.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public static List<List<Integer>> binaryTreeLevelOrderTraversal(TreeNode root){

        List<List<Integer>> resList = new ArrayList<>();

        if(root == null){
            return resList;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){

            List<Integer> temp = new ArrayList<>();

            int n = queue.size();

            for (int i = 0; i < n; i++) {

                TreeNode node = queue.poll();
                temp.add(node.val);

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
