
//
// Complete the method to simulate tossing a coin.
// Return "Heads" if the coin comes up heads or "Tails" if it is tails
//
//

import java.util.Random;
public class Coin
{
   public static final int HEADS = 0;
   public static final int TAILS = 1;

   private Random generator;

   /**
    * Constructs a default Coin
    */
   public Coin()
   {
      generator = new Random();
      final long SEED = 42; //leave this line alone
      generator.setSeed(SEED); //leave this line alone

   }

   /**
    * Gets the result of a simpulated coin toss
    * @return randomly "Heads" or "Tails"
    */
   public String toss()
   {
       //TODO Complete the method to randomly return "Heads" or "Tails"
   }
}
