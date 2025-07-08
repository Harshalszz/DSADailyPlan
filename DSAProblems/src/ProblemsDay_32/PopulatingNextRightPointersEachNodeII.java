package ProblemsDay_32;

public class PopulatingNextRightPointersEachNodeII {
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
    public Node connect(Node root) {

        if(root == null){
            return null;
        }
        // cuurent node pointing to root
        Node curr = root;

        while(curr != null){
            // creatinf a dummy node
            // and temp will point ot dummy
            Node dummy = new Node(0);
            Node temp = dummy;

            while(curr !=null){

                // if left node exist then point temp.next to cuur.left
                //tmep = tmep.etx
                if(curr.left !=null){
                    temp.next = curr.left;
                    temp= temp.next;
                }

                if(curr.right !=null){
                    temp.next = curr.right;
                    temp= temp.next;
                }

                curr = curr.next;
            }

            curr = dummy.next;
        }

        return root;

    }

    public static void main(String[] args) {

    }
}
