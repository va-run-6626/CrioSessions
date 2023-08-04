package DSA_1_B1_May.Session2;

import java.util.Scanner;

public class Prog1_FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of the array :");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be found in the array :");
        int x = sc.nextInt();
        System.out.println("Element found at : "+ findElement(n,arr,x));
    }
    public static int findElement(int n, int[] arr, int x){
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}