package DSA_1_B1_May.Session3;

import java.util.Scanner;
import java.util.Stack;

public class Prog2_PostFixExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Postfix expression : ");
        String str = sc.nextLine();
        System.out.println("Answer : " + evaluate(str));
    }
    public static Integer evaluate(String str){
        String[] ch = str.split(" ");
        Stack<Integer> stack = new Stack<>();
        for(String c : ch){
            if(isDigit(c)){
                stack.push(Integer.parseInt(c));
            }else{
                int b = stack.pop();
                int a = stack.pop();
                stack.push(compute(a,b,c));
            }
        }
        return stack.pop();
    }
    public static boolean isDigit(String str){
        return (str.charAt(0) >= '0' && str.charAt(0) <= '9');
    }
    public static Integer compute(int a , int b , String c){
        switch (c){
            case "+" : return  a + b;
            case "-" : return  a - b;
            case "*" : return  a * b;
            case "/" : return  a / b;
        }
        return -1;
    }
}