package DSA_3_August.Session2;

import java.util.*;

public class Prog3_distinctSlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array1 Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Window size : ");
        int m = sc.nextInt();
        System.out.println("Array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Distinct count of each window is : " +distinct(arr,n,m));
    }
    public static List<Integer> distinct(int[]arr,int n,int m){
        List<Integer> list = new ArrayList<>();
        if(n == 0 || m > n){
            return list;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < m; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        list.add(map.size());
        for(int i = m; i < n; i++){
            map.put(arr[i-m],map.getOrDefault(arr[i-m],0)-1);
            if(map.get(arr[i-m]) == 0){
                map.remove(arr[i-m]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            list.add(map.size());
        }
        return list;
    }
}
