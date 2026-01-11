package ProblemsDay_216;

public class VerifyPreorderSerializationBinaryTree {

    //https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/?envType=problem-list-v2&envId=binary-tree
    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        int diff = 1;
        for(String nn : nodes){
            diff--;
            if(diff < 0){
                return false;
            }
            if(!nn.equals("#")){
                diff += 2;
            }
        }
        return diff == 0;
    }
    public static void main(String[] args) {

    }
}
