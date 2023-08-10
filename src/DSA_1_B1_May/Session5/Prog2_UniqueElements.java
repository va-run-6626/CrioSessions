package DSA_1_B1_May.Session5;

import java.util.*;

public class Prog2_UniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique elemets : " + unique(arr));
        System.out.println("size : " + unique(arr).size());
    }
    public static Set unique(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        return set;
    }
}
