package DSA_1_B1_May.Session3.CommonStringOperations;

import java.util.Scanner;

public class Prog4_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to be rotated : ");
        String str = sc.next();
        System.out.println("Enter the number of rotations : ");
        int k = sc.nextInt();
        System.out.println("String after left rotation :" + leftRotate(str,k,str.length()));
        System.out.println("String after right rotation :" + rightRotate(str,k,str.length()));
    }
    public static String rightRotate(String str,int k, int n){
        char[] ch = str.toCharArray();
        k %= n;
        reverse(ch,0,n-k-1);
        reverse(ch,n-k,n-1);
        reverse(ch, 0,n-1);
        return new String(ch);
    }
    public static String leftRotate(String str , int k , int n){
        char[] ch = str.toCharArray();
        k %= n;
        reverse(ch, 0,n-1);
        reverse(ch,n-k,n-1);
        reverse(ch, 0,n-k-1);
        return new String(ch);
    }
    public static void reverse(char[] arr, int start , int end){
        for(int i = start, j = end; i <= (start+end)/2 && j >=(start+end)/2; i++, j--){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}