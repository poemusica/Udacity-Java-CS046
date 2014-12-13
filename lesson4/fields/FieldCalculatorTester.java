public class FieldCalculatorTester
{
    public static void main(String[] args)
    {
        FieldCalculator fields = new FieldCalculator();
        System.out.println("Actual: " + fields.getNumberOfFields(1900, 4000));
        System.out.println("Expected: 8");
    }
}
