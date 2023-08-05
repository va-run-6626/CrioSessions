package DSA_1_B1_May.Session3.CommonStringOperations;

import java.util.Scanner;

public class Prog3_SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string that needs to be sorted : ");
        String str = sc.next();
        System.out.println("Given String : " + str);
        System.out.println("Sorted String : " + sortString(str));
    }
    public static String sortString(String str){
        int[] map = new int[26];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            map[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i]; j++){
                sb.append((char)('a'+i));
            }
        }
        return sb.toString();
    }
}