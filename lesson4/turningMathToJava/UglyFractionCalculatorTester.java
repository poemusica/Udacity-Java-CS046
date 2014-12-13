public class UglyFractionCalculatorTester {
    public static void main(String[] args) 
    {
        UglyFractionCalculator calculator = new UglyFractionCalculator();
        System.out.println("Actual:   " + calculator.uglyFraction(3,4));
        System.out.println("Expected: 0.3333333...");
        
        System.out.println("Actual:   " + calculator.uglierFraction(3));
        System.out.println("Expected: 1.1333333...");
        
        System.out.println("Actual:   " + calculator.average(3, 4, 3, 3));
        System.out.println("Expected: 3.25");
    }
}