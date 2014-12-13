// BlueJ project: lesson6/buffon_pi_estimation

// Estimates pi using the Compte de Buffon's needle dropping method
// Take a 1 inch needle. Repeatedly drop it on a sheet of
// ruled paper whose lines are 2 inches apart
// tries / hits = an approximation of pi

import java.util.Random;
import java.util.Scanner;

public class BuffonPiEstimation
{
    public static void main(String[] args)
    {
        System.out.println("Buffon Pi Estimation");
        System.out.println("Enter the number of tries: ");
        Scanner in = new Scanner(System.in);
        int tries = in.nextInt();

        Random generator = new Random(42);

        // YOUR CODE HERE
        // Calculate the number of hits.
        // generate a yLow, the lowest point, or the farthest point on
        // the needle from the line (a number between 0 and 2).
        // generate a random angle a between 0 and 180 degrees.
        // yHigh is yLow plus the sine of a.
        // if yHigh is above the line (the line is at a height of 2),
        // the needle is touching the line, and counts as a hit.
        // Hint: Math.sin takes an angle in radians.

        System.out.println(piEstimate);
    }
}
