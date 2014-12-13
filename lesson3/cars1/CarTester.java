
public class CarTester
{
    // instance variables - replace the example below with your own
    private Car car;


    public CarTester()
    {
        // initialise instance variables
        car = new Car();
    }

    public void testGas(int y)
    {
        System.out.print("Expected gas: ");
        System.out.println(car.getGasInTank() + y);
        car.addGas(y);
        double gas = car.getGasInTank();
        System.out.println(gas);
        
    }
}
