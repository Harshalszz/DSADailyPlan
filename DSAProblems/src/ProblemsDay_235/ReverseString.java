package ProblemsDay_235;

public class ReverseString {
//https://leetcode.com/problems/reverse-string/
    private void reverse(char[] s,int i,int n){
        if(i>n/2)return;
        char temp = s[i];
        s[i] = s[n-i];
        s[n-i] = temp;
        reverse(s,i+1,n);
    }
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
    public static void main(String[] args) {

    }
}
