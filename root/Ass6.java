package root;

import java.util.Random;

public class Ass6 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();
        for (int i = 0; i < 100; i++) arr[i] = rand.nextInt(200);
        
        int target = 50; // Given integer
        boolean found = false;
        for (int num : arr) {
            if (num == target) { found = true; break; }
        }
        System.out.println("Integer " + target + " found: " + found);
    }
}
