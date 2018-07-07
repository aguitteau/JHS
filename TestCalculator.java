
public class TestCalculator {
    private double value;
    
    public TestCalculator () {
        value = 0.0;
    }
    
    public static void main (String[] args) { //main method to test calculator
        
    }
    
    public void add (double addend) { value += addend; }
    
    public void subtract (double subtrahend) { value -= subtrahend; }
    
    public void multiply (double multiplier) { value *= multiplier; }
    
    public void divide (double divisor) { value /= divisor; }
    
}
