// To-do: 
// Create 2 packages: 
// com.udacity.carshare (for Simulation and Car)
// and com.udacity (for Person)
// Move each class to the appropriate package. 
// One class does not need to be moved. 
// Add the necessary imports so that the code will 
// still work. 
// Keep track of where you add imports so you can answer
// the question. 

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
