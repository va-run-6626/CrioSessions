package DSA_3_August.Session3;

import java.util.*;

public class Prog1_ArnagramsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String and its Pattern : ");
        System.out.print("String : ");
        String string = sc.next();
        System.out.println();
        System.out.print("Pattern : ");
        String pattern = sc.next();
        System.out.println();
        System.out.println("All anagrams : " + findAnagrams(string,pattern));
    }
    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> list = new ArrayList<>();
        if(s.length() < p.length()){
            return list;
        }
        Map<Character,Integer> mapCount = new HashMap<>();
        Map<Character,Integer> mapWindow = new HashMap<>();
        addToMap(mapCount,p);
        addToMap(mapWindow,s.substring(0,p.length()));
        if(mapCount.equals(mapWindow)){
            list.add(0);
        }
        for(int i = p.length(); i < s.length(); i++){
            mapWindow.put(s.charAt(i-p.length()), mapWindow.getOrDefault(s.charAt(i-p.length()),0)-1);
            if(mapWindow.get(s.charAt(i-p.length())) == 0){
                mapWindow.remove(s.charAt(i-p.length()));
            }
            mapWindow.put(s.charAt(i),mapWindow.getOrDefault(s.charAt(i),0)+1);
            if(mapCount.equals(mapWindow)){
                list.add(i - p.length() + 1);
            }
        }
        return list;
    }

    private static void addToMap(Map<Character, Integer> mapCount, String p) {
        for(int i = 0; i < p.length(); i++){
            mapCount.put(p.charAt(i), mapCount.getOrDefault(p.charAt(i),0)+1);
        }
    }
}
