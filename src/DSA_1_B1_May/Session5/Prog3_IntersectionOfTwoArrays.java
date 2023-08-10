package DSA_1_B1_May.Session5;

import org.w3c.dom.ls.LSException;

import java.util.*;

public class Prog3_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array1 Size : ");
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        System.out.println("Array1 : ");
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println("Array2 Size : ");
        int m = sc.nextInt();
        List<Integer> b = new ArrayList<>();
        System.out.println("Array2 : ");
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }
        List<Integer> result = intersectionOfTwoArraysBasic(n,a,m,b);
        System.out.println("Answer list : " + result);
    }
    public static List<Integer> intersectionOfTwoArraysBasic(int n, List<Integer> a, int m, List<Integer> b){
        Map<Integer,Integer> map = new HashMap<>();
        boolean larger = n > m;
        if(larger){
            mapInsertion(map,a);
        }else{
            mapInsertion(map,b);
        }
        List<Integer> ans;
        if(larger) {
            ans = computeIntersection(map, b);
        }else{
            ans = computeIntersection(map, a);
        }
        return ans;
    }
    public static void mapInsertion(Map<Integer,Integer> map, List<Integer> list){
        for(Integer i : list){
            map.put(i,map.getOrDefault(i,0)+1);
        }
    }
    public static List<Integer> computeIntersection(Map<Integer,Integer> map, List<Integer> list){
        List<Integer> ans = new ArrayList<>();
        for(Integer i : list){
            if(map.containsKey(i)){
                if(map.get(i) > 0){
                    ans.add(i);
                    map.put(i,map.getOrDefault(i,0)-1);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
