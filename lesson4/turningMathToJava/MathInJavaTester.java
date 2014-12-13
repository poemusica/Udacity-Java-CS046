public class MathInJavaTester
{
    public static void main(String[] args)
    {
        MathInJava mathObj = new MathInJava();
        System.out.println("Actual:   " + mathObj.uglyFraction(4, 3));
        System.out.println("Expected: 0.15");
        System.out.println("Actual:   " + mathObj.uglyFraction(3, 4));
        System.out.println("Expected: 0.3333333333333333");

        System.out.println("Actual:   " + mathObj.uglierFraction(8));
        System.out.println("Expected: 2.025");
        System.out.println("Actual:   " + mathObj.uglierFraction(3));
        System.out.println("Expected: 1.1333333333333333");

        System.out.println("Actual:   " + mathObj.average(3, 4, 5, 4));
        System.out.println("Expected: 4");
        System.out.println("Actual:   " + mathObj.average(3, 4, 3, 3));
        System.out.println("Expected: 3.25");
    }
}
