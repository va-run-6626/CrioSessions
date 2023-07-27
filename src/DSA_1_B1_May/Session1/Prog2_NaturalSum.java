package DSA_1_B1_May.Session1;

import java.util.Scanner;

public class Prog2_NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Sum of first "+n+" natural number is : " + naturalSum(n));
        System.out.println("Sum of first "+n+" natural number is : " + naturalSumFormula(n));
    }
    public static int naturalSum(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static int naturalSumFormula(int n){
        return (n * (n +1))/2;
    }
}