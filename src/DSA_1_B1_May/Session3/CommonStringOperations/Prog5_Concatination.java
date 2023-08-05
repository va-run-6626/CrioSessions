package DSA_1_B1_May.Session3.CommonStringOperations;

import java.util.Scanner;

public class Prog5_Concatination{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String str1 = sc.next();
        System.out.println("Enter String 2 : ");
        String str2 = sc.next();
        System.out.println("Concatenated String : " + concat(str1, str2));
    }
    public static String concat(String str1, String str2){
        return str1 + " " + str2;
    }
}