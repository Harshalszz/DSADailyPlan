package ProblemsDay_44;

public class ClearDigits {
    //https://leetcode.com/problems/clear-digits/

    public static String clearDigits(String s) {

        StringBuilder res = new StringBuilder();

        for(char ch : s.toCharArray()){

            if(Character.isDigit(ch)){
                if(res.length()>0){
                    res.deleteCharAt(res.length() -1);
                }
            }
            else{
                res.append(ch);
            }
        }

        return  res.toString();

    }

    public static void main(String[] args) {

        String s = "abc34";
        System.out.println(clearDigits(s));

    }
}
