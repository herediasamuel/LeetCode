/**
 *  Longest Common Prefix:
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string ""..
 * site: https://leetcode.com/problems/longest-common-prefix/
 * Author: Samuel Heredia. heredia.samuel@gmail.com
 * Date: 01-05-2021
 * Note: If you find something in the algorithm that can be improved,
 * I would like to receive your comments. Thanks
 */
public class LongestCommonPrefix {
    public static void  main (String arg[]){
        String[] test = {"flower","flow","flight"};
        System.out.println("Result is: " + longestCommonPrefix(test));
    }
    static public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 ){ 
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()){
                 return "";
                }
            }
        return prefix;
    }
}