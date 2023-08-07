package DSA_1_B1_May.Session3;

import java.util.Scanner;
import java.util.Stack;

public class Prog4_ValidParenthsis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parenthsis sequence : ");
        String str = sc.next();
        System.out.println("Valid Parenthsis : " + isValid(str));
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty() && (s.charAt(i) == ')' ||s.charAt(i) == ']'||s.charAt(i) == '}'))return false;
            else if(!stack.isEmpty()){
                if(stack.peek() == '(' && s.charAt(i) == ')')stack.pop();
                else if(stack.peek() == '[' && s.charAt(i) == ']')stack.pop();
                else if(stack.peek() == '{' && s.charAt(i) == '}')stack.pop();
                else stack.add(s.charAt(i));
            }else stack.add(s.charAt(i));
        }
        return stack.isEmpty();
    }
}



