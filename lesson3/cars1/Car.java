public class Car
{
    private double milesDriven;
    private double gasInTank;
    private double milesPerGallon;
    private Picture pic;
    
    public Car()
    {
        milesDriven = 0;
        gasInTank = 10;
        milesPerGallon = 50;
        pic = new Picture("http://www.picturesnew.com/media/images/car-clipart.png");
        pic.draw();
    }
    
    public void drive(double distance)
    {
        milesDriven = milesDriven + distance;
        double gasConsumed = distance / milesPerGallon;
        gasInTank = gasInTank - gasConsumed;
        
        int pixelsPerMile = 10;
        pic.translate(distance * pixelsPerMile, 0);
        pic.draw();
        
    }

    public void addGas(double amount)
    {
        gasInTank = gasInTank + amount;
    }

    // More methods...
    
    public double getMilesDriven()
    {
        return milesDriven;
    }
    
    public double getGasInTank()
    {
        return gasInTank;
    }
}
