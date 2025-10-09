package ProblemsDay_124;

public class ExcelSheetColumnTitle {
//https://leetcode.com/problems/excel-sheet-column-title/?envType=problem-list-v2&envId=string
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            result.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {

    }
}
