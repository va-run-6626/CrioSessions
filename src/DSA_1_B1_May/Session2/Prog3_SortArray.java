package DSA_1_B1_May.Session2;

import java.util.Arrays;
import java.util.Scanner;

public class Prog3_SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length : " );
        int n = sc.nextInt();
        String[] arr= new String[n];
        System.out.println("Enter elements in Array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        print(arr);
        System.out.println("Sorted Array : ");
        sortArray(arr);
        print(arr);
    }
    public static void sortArray(String[] arr){
        Arrays.sort(arr);
    }
    public static void print(String[]arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}