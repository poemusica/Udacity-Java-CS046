// Here is a class called UnitCircle. Its radius is an int. A couple of methods have been
// provided.
//
// Add the code so that the UnitCircle class implements the Comparable interface
//

/**
 * Represents a circle whose radius is multiples of the unit circle - a circle with radius 1
 */
// TODO: add everything necessary for this class to implement Comparable
// HINT: There are two thing s you need to do
public class UnitCircle
{
   private int radius;

   public UnitCircle(int radius)
   {
       this.radius = radius;
   }

   public int getRadius()
   {
       return radius;
   }

   public String toString()
   {
       return "UnitCircle[r=" + radius + "]";
   }


   //... other methods


}
