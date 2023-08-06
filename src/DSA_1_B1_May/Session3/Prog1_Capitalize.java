package DSA_1_B1_May.Session3;

import java.util.Scanner;

public class Prog1_Capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to capitalize : ");
        String str = sc.nextLine();
        System.out.println("After Capitalization : ");
        System.out.println(capitalizeOne(str));
        System.out.println(capitalizeTwo(str));
    }
    public static String capitalizeOne(String str){
        char[] ch = str.toCharArray();
        if(Character.isLowerCase(ch[0])){
            ch[0] = Character.toUpperCase(ch[0]);
        }
        for(int i = 1; i < ch.length; i++){
            if(ch[i-1] == ' ' && Character.isLowerCase(ch[i])){
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        return new String(ch);
    }
    public static String capitalizeTwo(String str){
        char[] ch = str.toCharArray();
        if(isLowerCase(ch[0])){
            ch[0] = toUpperCase(ch[0]);
        }
        for(int i = 1; i < ch.length; i++){
            if(ch[i-1] == ' ' && isLowerCase(ch[i])){
                ch[i] = toUpperCase(ch[i]);
            }
        }
        return new String(ch);
    }
    public static boolean isLowerCase(char ch){
        if(ch >= 'a' && ch <= 'z'){
            return true;
        }
        return false;
    }

    public static char toUpperCase(char ch){
        return (char)(ch - 'a' + 'A');
    }
}