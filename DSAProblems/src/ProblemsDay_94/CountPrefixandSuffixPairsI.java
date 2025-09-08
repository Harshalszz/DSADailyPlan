package ProblemsDay_94;

public class CountPrefixandSuffixPairsI {

    //https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/?envType=problem-list-v2&envId=trie

    public boolean isPrefixAndSuffix(String str1, String str2){

        if (str2.startsWith(str1) && str2.endsWith(str1) ){
            return true;
        }

        return false;
    }

    public int countPrefixSuffixPairs(String[] words) {

        int res = 0;

        for(int  i=0; i<words.length ; i++){

            for(int j = i+1; j<words.length ; j++){

                if(isPrefixAndSuffix(words[i], words[j])){
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
