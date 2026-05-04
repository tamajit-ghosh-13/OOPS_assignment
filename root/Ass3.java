package root;

public class Ass3 {
    public static void main(String[] args) {
        int[] primes = new int[25]; 
        int index = 0;
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) { isPrime = false; break; }
            }
            if (isPrime) primes[index++] = i;
        }
        for (int i = 0; i < index; i++) System.out.print(primes[i] + " ");
    }
}
