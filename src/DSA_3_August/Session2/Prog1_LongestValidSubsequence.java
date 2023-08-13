package DSA_3_August.Session2;

import java.util.*;

public class Prog1_LongestValidSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Parenthesis string : ");
        String str = sc.next();
        System.out.println("Longest valid parenthesis : " + longestValidParenthesis(str));
    }
    public static int longestValidParenthesis(String str){
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxValid = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push(i);
            }else{
                if(stack.size() > 1){
                    stack.pop();
                    maxValid = Math.max(maxValid,i - stack.peek());
                }else if(stack.size() == 1){
                    stack.pop();
                    stack.push(i);
                }
            }
        }
        return maxValid;
    }
}
