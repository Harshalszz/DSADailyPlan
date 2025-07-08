package ProblemsDay_32;

public class PopulatingNextRightPointersEachNode {
    //https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
    public Node connect(Node root) {
// as we know that the binary tree is complete binary tree, so there will always be left and right node
        if(root == null || root.left == null || root.right == null){
            return root;
        }

        root.left.next = root.right;

        if(root.next !=null){
            root.right.next = root.next.left;
        }

        connect(root.left);
        connect(root.right);

        return root;

    }

    public static void main(String[] args) {

    }
}
