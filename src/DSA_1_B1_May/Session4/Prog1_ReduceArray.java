package DSA_1_B1_May.Session4;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prog1_ReduceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(reduceArray(arr,n));
    }
    public static int reduceArray(int[] arr, int n){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int a : arr){
            queue.add(a);
        }
        while(queue.size() > 1){
            queue.add(queue.poll() - queue.poll());
        }
        return queue.poll();
    }
}
