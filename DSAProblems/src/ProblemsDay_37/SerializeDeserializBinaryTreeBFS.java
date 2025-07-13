package ProblemsDay_37;

import ProblemsDay_25.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializBinaryTreeBFS {
    //https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

    public String serialize(TreeNode root) {

        if(root == null){
            return "";
        }

        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder res = new StringBuilder();

        queue.add(root);

        while(!queue.isEmpty()){

            TreeNode node = queue.poll();

            if(node == null){
                res.append("n ");
                continue;
            }

            res.append(node.val + " ");

            queue.add(node.left);
            queue.add(node.right);
        }

        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        if(data == ""){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        String[] nodeValue = data.split(" ");

        TreeNode root = new TreeNode(Integer.parseInt(nodeValue[0]));

        queue.add(root);

        for(int i=1; i<nodeValue.length ; i++){

            TreeNode node = queue.poll();

            if(!nodeValue[i].equals("n")){

                TreeNode left = new TreeNode(Integer.parseInt(nodeValue[i]));
                node.left = left;
                queue.add(left);
            }

            if(!nodeValue[++i].equals("n")){
                TreeNode right = new TreeNode(Integer.parseInt(nodeValue[i]));
                node.right = right;
                queue.add(right);
            }
        }

        return root;

    }

    public static void main(String[] args) {

    }
}
