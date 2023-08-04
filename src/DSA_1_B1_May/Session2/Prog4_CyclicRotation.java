package DSA_1_B1_May.Session2;

import java.util.Arrays;
import java.util.Scanner;

public class Prog4_CyclicRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter elements in the array of length 5 : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number of times it should be rotated : ");
        int k = sc.nextInt();
        System.out.println("Array before Rotation : "+ Arrays.toString(arr));
        //rotateOne(arr,k);
        rotateTwo(arr,k);
        System.out.println("Array after rotation : " + Arrays.toString(arr));
    }

    //Optimized way to rotate array
    public  static void rotateTwo(int[] arr, int k){
        k %= arr.length;
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-k-1);
        reverse(arr,0,arr.length-1);
    }
    public static void reverse(int[] arr, int start, int end){
        for(int i = start, j = end; i <= (start+end)/2 && j >= (start+end)/2; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    //Brute Force to rotate an Array
    public static void rotateOne(int[] arr, int k){
        k %= arr.length;
        for(int i = 0; i < k; i++){
            rotateHelperOne(arr);
        }
    }
    public static void rotateHelperOne(int[] arr){
        int temp = arr[arr.length-1];
        for(int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}