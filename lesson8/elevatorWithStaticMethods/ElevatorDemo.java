import java.util.Scanner;

public class ElevatorDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int floor = readBetween(1, 18, in, "Floor");
        if (floor == 13)
        {
            System.out.println("Error: There is no thirteenth floor.");
        }
        else
        {
            int actualFloor;
            if (floor > 13)
            {
                actualFloor = floor - 1;
            }
            else
            {
                actualFloor = floor;
            }
            System.out.println("Actual floor: " + actualFloor);
        }
    }
    
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
