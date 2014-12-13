// Simulates 24 random dice rolls.
// Each roll has two dice. 
// Prints "He won" if any roll contained double sixes.
// Prints "He lost" otherwise.

import java.util.Random;

public class TwoDiceTwentyFourTimes
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        boolean heWins = false;
        
        // YOUR CODE HERE
        // Write a loop to simulate 24 dice rolls. 
        // Track whether the Chevalier de Meré wins or not
        if(heWins)
        {
            System.out.println("He won!");
        }
        else
        {
            System.out.println("He lost");
        }
    }
}
