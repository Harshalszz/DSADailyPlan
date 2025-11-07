package ProblemsDay_152;

public class BinaryStringWithSubstringsRepresentingToN {

    //https://leetcode.com/problems/binary-string-with-substrings-representing-1-to-n/?envType=problem-list-v2&envId=sliding-window
    public boolean queryString(String s, int n) {
        for(int i=1;i<=n;i++){
            String bin = Integer.toBinaryString(i);
            if(!s.contains(bin)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
