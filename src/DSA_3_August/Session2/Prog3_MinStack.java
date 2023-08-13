package DSA_3_August.Session2;

import java.util.*;
public class Prog3_MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;
    public Prog3_MinStack(){
        this.stack = new Stack<>();
        this.min = new Stack<>();
    }
    public void push(int val){
        stack.push(val);
        int m = Math.min(val,(min.isEmpty() ? val : min.peek()));
        min.push(m);
    }
    public void pop(){
        stack.pop();
        min.pop();
    }

    public int findMin(){
        return min.peek();
    }
    public int stackPeek(){
        return stack.peek();
    }
    public static void main(String[] args) {
        Prog3_MinStack minstack = new Prog3_MinStack();
        minstack.push(1);
        minstack.push(2);
        minstack.push(-3);
        minstack.push(-4);
        minstack.push(10);
        System.out.println("min at this point : " + minstack.findMin());
        minstack.pop();
        minstack.pop();
        System.out.println("min at this point : " + minstack.findMin());
        System.out.println("stack peek : "+ minstack.stackPeek());
    }
}
