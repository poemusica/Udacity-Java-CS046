import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class CarShareApp
{
    public static void main(String[] args) throws IOException
    {
        Simulation sim = new Simulation();
        sim.read(new Scanner(new File("input.txt")));
        sim.loadPassengers();
        sim.driveCars();
    }
}
