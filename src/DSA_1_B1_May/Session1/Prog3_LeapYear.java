package DSA_1_B1_May.Session1;

import java.util.Scanner;

public class Prog3_LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = sc.nextInt();
        System.out.println("Is the year a leap year : " + checkLeap(year));
    }
    public static boolean checkLeap(int year){
        if(year % 400 == 0){
            return true;
        }else if(year % 100 == 0){
            return false;
        }else if(year % 4 == 0){
            return true;
        }
        return false;
    }
}