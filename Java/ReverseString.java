/**
 *  Reverse String:
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * site: https://leetcode.com/problems/reverse-string/
 * Author: Samuel Heredia. heredia.samuel@gmail.com
 * Date: 27-04-2021
 * Note: If you find something in the algorithm that can be improved,
 * I would like to receive your comments. Thanks
 */
public class ReverseString {
    public static void  main (String arg[]){
        char[] test = {'h','e','l','l','o'};
        reverseString(test);
        int i = 0;
        System.out.println("Reverse String is : ");
        while(i < test.length) {
            System.out.print(test[i]);
            i++;
        }
    }
    static public void reverseString(char[] s) {
        char temp;
        int size = s.length - 1;
        int i = 0;
        while ( i <= size){
            temp = s[i];
            s[i] = s[size];
            s[size] = temp;
            i++;
            size--;
        }
    }
}