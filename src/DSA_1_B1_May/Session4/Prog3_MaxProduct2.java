package DSA_1_B1_May.Session4;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prog3_MaxProduct2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size : ");
        int n = sc.nextInt();
        System.out.println("Enter the array :");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Max Product : " + maxProduct(arr));
    }
    public static int maxProduct(int[] arr){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : arr){
            queue.add(i);
        }
        return ((queue.poll()-1) * (queue.poll()-1));
    }
}
