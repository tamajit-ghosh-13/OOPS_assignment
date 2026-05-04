package root;

public class Ass4 {
    public static void main(String[] args) {
        int[][] pascal = new int[4][];
        for (int i = 0; i < 4; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) System.out.print(pascal[i][j] + " ");
            System.out.println();
        }
    }
}
