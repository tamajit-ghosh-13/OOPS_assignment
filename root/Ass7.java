package root;

public class Ass7 {
    public static void main(String[] args) {
        int[][] A = new int[3][2];
        int[][] B = new int[3][2];
        int[][] C = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = i + j;
                B[i][j] = i * j;
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
