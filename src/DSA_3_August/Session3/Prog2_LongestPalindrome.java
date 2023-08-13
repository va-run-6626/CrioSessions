package DSA_3_August.Session3;

import java.util.*;

public class Prog2_LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();
        System.out.println("longest Palindrome : " + longestPalindrome(str));
    }

    private static int longestPalindrome(String str) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        int odd = 0, even = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            int val = entry.getValue();
            even += (val / 2) * 2;
            odd += val % 2;
        }
        return even + (odd == 0 ? 0 : 1);
    }

}
