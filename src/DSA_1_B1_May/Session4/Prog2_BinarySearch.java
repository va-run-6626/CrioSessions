package DSA_1_B1_May.Session4;

import java.util.Arrays;
import java.util.Scanner;

public class Prog2_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("sorted Array : " + Arrays.toString(arr));
        System.out.println("Enter the target to search:");
        int target = sc.nextInt();
        System.out.println("Found at : " + binarySearch(arr,target,n));
    }
    public static int binarySearch(int[] arr, int target, int n){
        int s = 0; int e = n-1;
        while(s <= e){
            int mid = s +(e - s)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return -1;
    }
}
