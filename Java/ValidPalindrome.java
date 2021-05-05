/**
 *  Valid Palindrome II:
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 * site: https://leetcode.com/problems/valid-palindrome-ii/
 * Author: Samuel Heredia. heredia.samuel@gmail.com
 * Date: 04-05-2021
 * Note: If you find something in the algorithm that can be improved,
 * I would like to receive your comments. Thanks
 */ 

public class ValidPalindrome {
    public static void  main (String arg[]){
        String test = "aba";
        System.out.println("Result is: " + validPalindrome(test));
    }
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1 ;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                if(isPalindrome(s.substring(0,i) + s.substring(i+1))||isPalindrome(s.substring(0,j) + s.substring(j+1))){
                    return true;
                }else{
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
        
    }
    
     public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1 ;
        while(i <= j){
           if(s.charAt(i) != s.charAt(j)){
              return false;
           }
           i++;
           j--;
        }
      return true;
        
    }

}