package ProblemsDay1;

public class LongerContiguousSegmentsofOnesthanZeros {
//https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/description/
    public static boolean longerContiguousSegmentsofOnesthanZeros(String s){
        int countOne = 0, maxCountOne = 0;
        int countZero = 0, maxCountZero = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                countOne += 1;
                maxCountZero = Math.max(countZero, maxCountZero);
                countZero = 0;

            } else {
                maxCountOne = Math.max(countOne, maxCountOne);
                countOne = 0;
                countZero += 1;
            }

        }

        maxCountZero = Math.max(countZero, maxCountZero);
        maxCountOne = Math.max(countOne, maxCountOne);

        if (maxCountOne > maxCountZero) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {

        String s = "110100010";
        System.out.println(longerContiguousSegmentsofOnesthanZeros(s));

    }
}
