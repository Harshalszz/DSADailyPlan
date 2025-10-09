package ProblemsDay_124;

public class ExcelSheetColumnNumber {

    //https://leetcode.com/problems/excel-sheet-column-number/?envType=problem-list-v2&envId=string
    public int titleToNumber(String columnTitle) {

        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;

    }

    public static void main(String[] args) {

    }
}
