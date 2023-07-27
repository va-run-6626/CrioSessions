package DSA_1_B1_May.Session1;

import java.util.Scanner;

public class Prog1_FindQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The two numbers: ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        System.out.println("The Quadrant that this Coordinate Belongs to is :" + findQuadrant(x,y));
        System.out.println("The Quadrant that this Coordinate Belongs to is (using Ternary) :" +findQuadrantTernary(x,y));
    }
    public static int findQuadrant(float x, float y){
        if(x > 0 && y > 0){
            return 1;
        }else if(x < 0 && y > 0){
            return 2;
        }else if(x < 0 && y < 0){
            return 3;
        }else{
            return 4;
        }
    }

    public  static int findQuadrantTernary(float x, float y){
        return (x > 0 && y > 0) ? 1 :((x < 0 && y > 0) ? 2 :((x < 0 && y < 0) ? 3 :4));
    }
}