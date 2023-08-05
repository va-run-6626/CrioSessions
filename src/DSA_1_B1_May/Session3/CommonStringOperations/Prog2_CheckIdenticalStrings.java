package DSA_1_B1_May.Session3.CommonStringOperations;

import java.util.Scanner;

public class Prog2_CheckIdenticalStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings that needed to be checked : ");
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println("Identical : " + checkIdentical(str1, str2));
    }
    public static boolean checkIdentical(String str1 , String str2){
        return str1.equals(str2);
    }
}