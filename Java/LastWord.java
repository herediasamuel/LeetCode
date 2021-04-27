/**
 * Length of Last Word:
 * Given a string s consists of some words separated by spaces,
 * return the length of the last word in the string.
 * If the last word does not exist, return 0.
 * A word is a maximal substring consisting of non-space characters only.
 * site: https://leetcode.com/problems/length-of-last-word/
 * Author: Samuel Heredia. heredia.samuel@gmail.com
 * Date: 27-04-2021
 * Note: If you find something in the algorithm that can be improved,
 * I would like to receive your comments. Thanks
 */
public class LastWord {

    public static void main(String arg[]){
        String test= "Hello Word";
        System.out.println("Length of last word is : "+ lengthOfLastWord(test));
    }

    static public int lengthOfLastWord(String s) {
        int count = 0;
        if(s == null || s.isEmpty() || s.equals(" ")){
            return 0;
        }else{
            int i = 1;
            boolean band = true;
            int size = s.length();
            if(size == 1){
                count++;
            }else{
                while(s.charAt(size-i) == ' '){
                    if(size == i){
                        return 0;
                    }
                    i++;
                }
                while(band){
                    if(size == i){
                        band = false;
                    }
                    if(s.charAt(size-i) != ' '){
                        count++;
                    }else{
                        band = false;
                    }
                    i++;
                }
            }
        }
        return count;
    }
}
