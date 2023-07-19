package Array;

import java.util.*;

public class twoDArray {
    public static void main(String arg[]) {
        // Ways to declare 2-d Array
        int A[][] = new int[5][5];

        int B[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int C[][];
        C = new int[5][5];

        int[] D[] = new int[5][5];

        // Traversing an array

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.println(B[i][j]);
            }
            System.out.println(" ");

        }

    }
}
