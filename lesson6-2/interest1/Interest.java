// Bluej project: interest1
public class Interest
{
    public static void main(String[] args)
    {
        double balance = 100;
        double target = 1000000;
        double rate = 0.01;
        int year = 0;
        while (balance < target)
        {
            double interest = balance * rate;
            balance = balance + interest;
            year++;
            System.out.printf("Year %d: %8.2f\n",
                              year, balance);
        }
    }
}
