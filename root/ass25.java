package root;

public class ass25 {
    public static void main(String[] args) {
        try {
            int x = 0;
            @SuppressWarnings("unused")
            int y = 3 / x; // This will trigger ArithmeticException[cite: 1]
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Division by zero.");
            // Printing the origin/stack trace as requested[cite: 1]
            System.out.println("Origin of Exception: " + e.toString());
            e.printStackTrace(); 
        }
    }
}
