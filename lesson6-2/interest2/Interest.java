// Video: For or While? 
public class Interest
{
    public static void main(String[] args)
    {
        double balance = 10000;
        double rate = 0.10;
        int numberOfYears = 30;
        for (int year = 1; year <= numberOfYears; year++)
        {
            double interest = balance * rate;
            balance = balance + interest;
            System.out.printf("Year %d: %8.2f\n", year, balance);
        }
    }
}
