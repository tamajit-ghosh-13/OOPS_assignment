package root;

// Superclass and subclasses as requested[cite: 1]
class MathException extends Exception {
    public MathException(String msg) { super(msg); }
}
class OverFlowException extends MathException {
    public OverFlowException() { super("Overflow occurred"); }
}
class UnderFlowException extends MathException {
    public UnderFlowException() { super("Underflow occurred"); }
}

public class ass28 {
    public static void main(String[] args) throws MathException {
        try {
            // Code segment that throws an OverFlowException[cite: 1]
            throw new OverFlowException();
        } 
        // Order of catch blocks matters (most specific to most general)
        catch (OverFlowException e) {
            System.out.println("Handled specifically: " + e.getMessage());
        } 
        catch (UnderFlowException e) {
            System.out.println("Handled specifically: " + e.getMessage());
        } 
        catch (MathException e) {
            // In the first catch block (MathException), re-throw it[cite: 1]
            System.out.println("MathException caught. Re-throwing...");
            throw e; 
        }
    }
}
