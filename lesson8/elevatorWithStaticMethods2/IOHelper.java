import java.util.Scanner;

public class IOHelper
{
    /**
       Reads an integer in a range.
       @param low the lowest permitted value
       @param high the highest permitted value
       @param in the scanner
       @param prompt the prompt for the user
       @return the value read
    */
    public static int readBetween(int low, int high, Scanner in, String prompt)
    {
        while (true)
        {
            if (prompt != null)
            {
                System.out.print(prompt + ": ");
            }
            if (in.hasNextInt())
            {
                int input = in.nextInt();
                if (low <= input && input <= high)
                {
                    return input;
                }
                else
                {
                    System.out.println("Error: The input must be between " + low + " and " + high);
                }
            }
            else
            {
                System.out.println("Error: Not an integer.");
            }
        }
    }
}
