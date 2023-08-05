package DSA_1_B1_May.Session3.CommonStringOperations;

import java.util.*;
import java.util.Scanner;

public class Prog6_CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();
        System.out.println("Frequency of chars : ");
        charFrequency(str);
    }
    public static void charFrequency(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println("Key : " + entry.getKey() +"   " +"Value : "+ entry.getValue());
        }
    }
}