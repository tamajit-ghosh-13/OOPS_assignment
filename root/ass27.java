package root;

public class ass27 {
    public static void main(String[] args) {
        try {
            handleArray();
        } catch (Exception e) {
            // Catching the re-thrown exception from handleArray
            System.out.println("Main caught re-thrown exception: " + e);
        }
    }

    public static void handleArray() throws Exception {
        try {
            int[] numbers = new int[10];
            numbers[15] = 100;
        } 
        // Second catch block for specific exception
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException locally.");
            // Print origin of the exception[cite: 1]
            e.printStackTrace(); 
        }
        // First catch block for general Exception[cite: 1]
        catch (Exception e) {
            System.out.println("General exception caught. Re-throwing...");
            throw e; // Re-throw the exception caught[cite: 1]
        }
    }
}
