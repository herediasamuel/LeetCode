/**
 *  Excel Sheet Column Number:
 * Given a string columnTitle that represents the column title as appear in an Excel sheet, 
 * return its corresponding column number.
 * site: https://leetcode.com/problems/excel-sheet-column-number/
 * Author: Samuel Heredia. heredia.samuel@gmail.com
 * Date: 03-05-2021
 * Note: If you find something in the algorithm that can be improved,
 * I would like to receive your comments. Thanks
 */
public class ExcelSheetColumnNumber {
    public static void  main (String arg[]){
        String test = "ABCDE";
        System.out.println("Result is: " + titleToNumber(test));
    }
    public static  int titleToNumber(String columnTitle) {
        var result = 0;
        int multiple = 1;
        int n = columnTitle.length();
        for(var i = n -1 ; i >= 0; i--){
            result = result + (columnTitle.charAt(i) - 64) * multiple;
            multiple = multiple * 26;
        }
        return result;
    }
}