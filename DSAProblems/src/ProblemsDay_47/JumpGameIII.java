package ProblemsDay_47;

public class JumpGameIII {
    //https://leetcode.com/problems/jump-game-iii/

    public boolean canReach(int[] arr, int start) {
        if(start<0|| start>=arr.length||arr[start]<0) {
            return false;
        }
        if(arr[start]==0){
            return true;
        }

        int jumps=arr[start];
        arr[start]=-arr[start];

        return canReach(arr,start + jumps)||canReach(arr,start - jumps);
    }
    public static void main(String[] args) {

    }
}
