import java.util.Scanner;

public class ElevatorDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int floor = IOHelper.readBetween(1, 18, in, "Floor");
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
}
