public class Car
{
    private double milesDriven;
    private double gasInTank;
    private double milesPerGallon;

    public Car()
    {
        milesDriven = 0;
        gasInTank = 0;
        milesPerGallon = 50;
    }

    public void drive(double distance)
    {
        milesDriven = milesDriven + distance;
        double gasConsumed = distance / milesPerGallon;
        gasInTank = gasInTank - gasConsumed;
    }

    public void addGas(double amount)
    {
        gasInTank = gasInTank + amount;
    }

    public double getMilesDriven()
    {
        return milesDriven;
    }

    public double getGasInTank()
    {
        return gasInTank;
    }
}
