package ProblemsDay_235;

public class ReverseWordsinString {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int l=0 ;
        int r= words.length -1;
        String temp;

        while(l<r){
            temp = words[l];
            words[l] = words[r];
            words[r] = temp;
            l++;
            r--;
        }

        StringBuilder result = new StringBuilder();

        for(String word : words){
            if(!word.isEmpty()){
                if(result.length() > 0){
                    result.append(" ");
                }
                result.append(word);
            }
        }

        return result.toString();
        /*
        String[] words = s.split(" ");
        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(word);
            }
        }

        return result.toString(); */

    }
    public static void main(String[] args) {

    }
}
