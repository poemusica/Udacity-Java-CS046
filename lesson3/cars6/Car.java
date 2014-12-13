/**
   A simulated car that consumes gas as it drives.
*/
public class Car
{
    private double milesDriven;
    private double gasInTank;
    private double milesPerGallon;


    /**
       Constructs a car with a given fuel efficiency.
       @param mpg the miles per gallon of this car
    */
    public Car(double mpg)
    {
        milesDriven = 0;
        gasInTank = 0;
        milesPerGallon = mpg;
    }


    // Your turn

    public void addGas(double amount)
    {
        gasInTank = gasInTank + amount;
    }

    /**
       Gets the current amount of gas in the tank of this car.
       @return the current gas level
    */
    public double getGasInTank()
    {
        return gasInTank;
    }

    /**
       Drives this car by a given distance.
       @param distance the distance to drive
    */
    public void drive(double distance)
    {
        milesDriven = milesDriven + distance;
        double gasConsumed = distance / milesPerGallon;
        gasInTank = gasInTank - gasConsumed;
    }

    /**
       Gets the current mileage of this car.
       @return the total number of miles driven
    */
    public double getMilesDriven()
    {
        return milesDriven;
    }
}
