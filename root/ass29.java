package root;

public class ass29 {
    public static void main(String[] args) {
        // Instantiate and initialize an integer variable[cite: 1]
        int value = 150; 

        try {
            // If value > 100 throw OverFlow, else UnderFlow[cite: 1]
            if (value > 100) {
                throw new OverFlowException();
            } else {
                throw new UnderFlowException();
            }
        } catch (OverFlowException e) {
            System.out.println("Catch Block: Value is too high! " + e.getMessage());
        } catch (UnderFlowException e) {
            System.out.println("Catch Block: Value is too low! " + e.getMessage());
        } catch (MathException e) {
            System.out.println("General Math Error.");
        }
    }
}
