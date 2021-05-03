/**
 * Fizz Buzz:
 * Given an integer n, return a string array answer (1-indexed) where:
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i if non of the above conditions are true..
 * https://leetcode.com/problems/fizz-buzz/
 * Author: Samuel Heredia. heredia.samuel@gmail.com
 * Date: 02-05-2021
 * Note: If you find something in the algorithm that can be improved,
 * I would like to receive your comments. Thanks
 */

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void  main (String arg[]){
        int test = 5;
        System.out.println("Result is: " );
        for (String val: fizzBuzz (test)
             ) {
            System.out.print(val+ " ");
        }
    }
    public static List<String> fizzBuzz (int n){
        List<String> result = new ArrayList<>();
        for (var i = 1; i <= n; i++ ){
            if(i%3 == 0 && i%5 == 0){
                result.add("FizzBuzz");
            }else{
                if(i%3 == 0){
                    result.add("Fizz");
                }else{
                    if(i%5 == 0){
                        result.add("Buzz");
                    }else{
                        result.add(String.valueOf(i));
                    }
                }
            }
        }
        return result;
    }
}