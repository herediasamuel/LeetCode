/**
 *  Valid Palindrome:
 * Given a string s, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases..
 * site: https://leetcode.com/problems/valid-palindrome/
 * Author: Samuel Heredia. heredia.samuel@gmail.com
 * Date: 04-05-2021
 * Note: If you find something in the algorithm that can be improved,
 * I would like to receive your comments. Thanks
 */

public class IsPalindrome {
    public static void  main (String arg[]){
        String test = "A man, a plan, a canal: Panama";
        System.out.println("Result is: " + isPalindrome(test));
    }

     public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^\\dA-Za-z]", "").toLowerCase();
        String reverse = new StringBuilder(s).reverse().toString();
        if(reverse.equals(s)){
            return true;
        }
        return false;
    }
}