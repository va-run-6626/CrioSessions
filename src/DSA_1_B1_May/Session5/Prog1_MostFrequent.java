package DSA_1_B1_May.Session5;

import java.util.*;

public class Prog1_MostFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Most frequent : " + Arrays.toString(mostFrequent(str)));
    }
    public static Object[] mostFrequent(String str){
        Map<Character,Integer> map = new TreeMap<>();
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        map.remove(' ');
        char ch = ' ';
        int max = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                ch = entry.getKey();
            }
        }
        return new Object[] {ch ,max};
    }
}
