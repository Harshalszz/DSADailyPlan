package ProblemsDay_205;

public class GoatLatin {
//https://leetcode.com/problems/goat-latin/?envType=problem-list-v2&envId=string
    public String toGoatLatin(String sentence) {
        String [] str=sentence.split(" ");
        String vowel="AEIOUaeiou";
        String[] res=new String[str.length];
        for(int i=0;i<str.length;i++){
            StringBuilder stb=new StringBuilder();
            String strs=str[i];
            if(vowel.indexOf(strs.charAt(0))!=-1){
                stb.append(strs);
            }
            else{
                stb.append(strs.substring(1));
                stb.append(strs.charAt(0));
            }
            stb.append("ma");
            for(int j=0;j<=i;j++){
                stb.append('a');
            }
            res[i]=stb.toString();

        }
        return String.join(" ",res);
    }

    public static void main(String[] args) {

    }
}
