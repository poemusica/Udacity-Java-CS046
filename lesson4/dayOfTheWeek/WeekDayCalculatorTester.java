public class WeekDayCalculatorTester
{
    public static void main(String[] args) 
    {
        // Write a test program
        // adding 1 to day 1 should give day 2
        // adding 6 to day 1 should give day 0
        // what should adding 10 to day 1 give? 
        WeekDayCalculator dayAdder = new WeekDayCalculator();
        System.out.println("Actual " + dayAdder.getDayOfTheWeek(1, 1));
        System.out.println("Expected 2");
        System.out.println("Actual " + dayAdder.getDayOfTheWeek(1, 6));
        System.out.println("Expected 0");
        System.out.println("Actual " + dayAdder.getDayOfTheWeek(1, 10));
        System.out.println("Expected 4");
    }
}
