package root;

public class ass30 {
    public static void main(String[] args) {
        try {
            String text = null;
            // This results in a NullPointerException[cite: 1]
            System.out.println(text.length()); 
        } catch (NullPointerException e) {
            // Necessary catch block to catch it[cite: 1]
            System.out.println("Error: Attempted to perform an operation on a null reference.");
        } finally {
            // Finally block with appropriate statements[cite: 1]
            System.out.println("Finally block: This code runs regardless of whether an exception occurred.");
            System.out.println("Cleaning up resources...");
        }
    }
}
