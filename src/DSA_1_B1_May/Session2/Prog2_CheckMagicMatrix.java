package DSA_1_B1_May.Session2;

import java.util.Scanner;

public class Prog2_CheckMagicMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[3][3];
        int n = grid.length;
        System.out.println("Fill the 3 * 3 grid : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        String ans = checkMagicMatrix(n,grid);
        System.out.println("Check if the given grid is MagicMatric : " + ans);
    }
    public static String checkMagicMatrix(int n, int[][] grid){
        int elements = n * n;
        int totalSum = (elements *(elements + 1))/2;
        int distSum = totalSum / n;

        int pDiagSum = 0;
        int sDiagSum = 0;
        for(int i = 0; i < n; i++){
            pDiagSum += grid[i][i];
            sDiagSum += grid[i][n-i-1];
        }
        if(pDiagSum != distSum || sDiagSum != distSum){
            return "No";
        }

        int rSum = 0;
        for(int i = 0; i < n; i++){
            rSum = 0;
            for(int j = 0; j < n; j++){
                rSum += grid[i][j];
            }
            if(rSum != distSum){
                return "No";
            }
        }
        int cSum = 0;
        for(int j = 0; j < n; j++){
            cSum = 0;
            for(int i = 0; i < n; i++){
                cSum += grid[i][j];
            }
            if(cSum != distSum){
                return "No";
            }
        }
        return "Yes";
    }

    /*
    matric with ans yes = [[4,9,2],
                           [3,5,7],
                           [8,1,6]]
     */
}