package root;

import java.util.Random;

public class Ass5 {
    public static void main(String[] args) {
        int[][] A = new int[3][2];
        int[][] B = new int[2][3];
        Random rand = new Random();

        System.out.println("Array A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = rand.nextInt(100);
                B[j][i] = A[i][j];
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Array B (Transpose):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) System.out.print(B[i][j] + " ");
            System.out.println();
        }
    }
}
