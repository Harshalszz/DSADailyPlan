package ProblemsDay_16;

public class RemoveAllAdjacentDuplicatesInString {

    public static String removeAllAdjacentDuplicatesInString(String s){
        StringBuilder res = new StringBuilder();
        int top=-1;

        for(char ch : s.toCharArray()){
            if(top >=0 && s.charAt(top) == ch){
                res.deleteCharAt(top--);
            }else{
                res.append(ch);
                top++;
            }

        }

        return res.toString();
    }

    public static void main(String[] args) {

        String s = "azxxzy";

        System.out.println(removeAllAdjacentDuplicatesInString(s));

    }
}
