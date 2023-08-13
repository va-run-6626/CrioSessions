package DSA_3_August.Session2;

import com.sun.source.util.JavacTask;

import java.util.*;

public class Prog4_firstUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        System.out.println("Enter the elements : ");
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < n; i++) {
            vector.add(sc.nextInt());
        }
        System.out.println("first unique : " + firstUnique(vector));
    }

    public static int firstUnique(Vector<Integer> vector) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < vector.size(); i++) {
            map.put(vector.get(i), map.getOrDefault(vector.get(i), 0) + 1);
        }
        int unique = -1;
        for (int i = 0; i < vector.size(); i++) {
            if (map.get(vector.get(i)) == 1) {
                unique = vector.get(i);
                break;
            }
        }
        return unique;
    }
}
    // example input : 1 2 3 4 5 6 2 1 5 8 9 1 7 6 5 8 2 3 5 6
