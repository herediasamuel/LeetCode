/**
 *  Evaluate Reverse Polish Notation:
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 * Note that division between two integers should truncate toward zero.
 * It is guaranteed that the given RPN expression is always valid. That means the expression
 * would always evaluate to a result, and there will not be any division by zero operation.
 * site: https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * Author: Samuel Heredia. heredia.samuel@gmail.com
 * Date: 03-05-2021
 * Note: If you find something in the algorithm that can be improved,
 * I would like to receive your comments. Thanks
 */
import java.util.ArrayList;
import java.util.List;

public class EvalRPN {
    public static void  main (String arg[]){
        String[] test = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println("Result is: " + evalRPN(test));
    }
    static public int evalRPN(String[] tokens) {
        List<String> result = new ArrayList<>();
        for(var i = 0; i < tokens.length; i++){
            switch (tokens[i]) {
                case "-":
                    result.add(String.valueOf(Integer.parseInt(result.get(result.size()-2)) - Integer.parseInt(result.get(result.size()-1))));
                    result.remove(result.size()-2);
                    result.remove(result.size()-2);
                    break;
                case "+":
                    result.add(String.valueOf(Integer.parseInt(result.get(result.size()-2)) + Integer.parseInt(result.get(result.size()-1))));
                    result.remove(result.size()-2);
                    result.remove(result.size()-2);
                    break;
                case "*":
                    result.add(String.valueOf(Integer.parseInt(result.get(result.size()-2)) * Integer.parseInt(result.get(result.size()-1))));
                    result.remove(result.size()-2);
                    result.remove(result.size()-2);
                    break;
                case "/":
                    result.add(String.valueOf(Integer.parseInt(result.get(result.size()-2)) / Integer.parseInt(result.get(result.size()-1))));
                    result.remove(result.size()-2);
                    result.remove(result.size()-2);
                    break;
                default:
                    result.add(tokens[i]);
                    break;
            }
        }
        return Integer.parseInt(result.get(0));
    }
}
