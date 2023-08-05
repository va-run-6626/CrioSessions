package DSA_1_B1_May.Session3.CommonStringOperations;

import java.util.Scanner;

public class Prog1_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string that needs to be reversed : ");
        String str = sc.next();
        System.out.println("Given string : " + str);
        System.out.println("Reversed string : " + reverse(str));
    }
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}