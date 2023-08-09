package DSA_3_August.Session1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Prog1_NextLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the Array elements : ");
        int[] ans = new int[n];
        for(int i = 0;i < n; i++){
            ans[i] = sc.nextInt();
        }
        System.out.println("Ans Array : " + Arrays.toString(nextLargestNumber(ans,n)));
    }
    public static int[] nextLargestNumber(int[] arr, int n){
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            ans[stack.pop()] = -1;
        }
        return ans;
    }
}