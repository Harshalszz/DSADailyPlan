package ProblemsDay_143;

public class LongPressedName {

    //https://leetcode.com/problems/long-pressed-name/?envType=problem-list-v2&envId=two-pointers
    public boolean isLongPressedName(String name, String typed) {
        int i=0,j=0,m=name.length(),n=typed.length();
        if(name.charAt(0)!=typed.charAt(0)) return false;
        while(i<m&& j<n){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }else{
                //if i and j pointer are not eqaual then forward j until j is not same
                while(j<n && typed.charAt(j-1)==typed.charAt(j)){
                    j++;
                }
                //check if ith character and jth character are  not equal
                if(i<m&& j<n&& name.charAt(i)!=typed.charAt(j) ) return false;
            }
        }
        //reached end of two strings
        if(i==m&& j==n)return true;
        // reached end of string name but not for typed
        if(i==m&& j!=n){
            //check if all remaining characters are same
            while(j<n && typed.charAt(j-1)==typed.charAt(j)) j++;
            if(j==n) return true;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
