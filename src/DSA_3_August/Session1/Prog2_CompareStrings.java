package DSA_3_August.Session1;

import java.util.Scanner;
import java.util.Stack;

public class Prog2_CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Strings : ");
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println("Compare to strings : " + compare(s1,s2));
    }
    public static boolean compare(String s1, String s2){
        s1 = removeBackspace(s1);
        s2 = removeBackspace(s2);
        return s1.equals(s2);
    }
    public static String removeBackspace(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '#' && !stack.isEmpty()){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}