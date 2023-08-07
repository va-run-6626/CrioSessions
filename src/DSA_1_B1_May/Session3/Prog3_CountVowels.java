package DSA_1_B1_May.Session3;

import java.util.Scanner;

public class Prog3_CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("Number of vowels : " + countVowels(str));
    }
    public static int countVowels(String str){
        int c = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') c++;
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')c++;
        }
        return c;
    }
}