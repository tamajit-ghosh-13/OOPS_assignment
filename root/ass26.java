package root;

public class ass26 {
    public static void main(String[] args) {
        try {
            // Create an array of 10 integers
            int[] numbers = new int[10];
            // Try to assign an integer in location 15
            numbers[15] = 100; 
        } catch (ArrayIndexOutOfBoundsException e) {
            // Print appropriate message in catch block
            System.out.println("Error: Attempted to access an index outside the array bounds.");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
