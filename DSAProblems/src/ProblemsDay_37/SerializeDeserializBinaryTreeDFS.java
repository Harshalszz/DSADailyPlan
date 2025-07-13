package ProblemsDay_37;

import ProblemsDay_25.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class SerializeDeserializBinaryTreeDFS {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        StringBuilder res = new StringBuilder();

        preOrder(root, res);

        return res.toString();

    }

    public static void preOrder(TreeNode root, StringBuilder res){

        if(root == null){
            res.append("n ");
            return;
        }
        //preorder adding the ele and then moving left and right
        res.append(root.val+" ");
        preOrder(root.left,res);
        preOrder(root.right, res);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(" ")));

        return construct(queue);
    }

    public static TreeNode construct(Queue<String> q){

        String val = q.poll();
        if (val.equals("n")){
            return null;
        }
        //preorder adding the ele and then moving left and right
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = construct(q);
        node.right = construct(q);
        return node;

    }

    public static void main(String[] args) {

    }
}
