
/**
 * Write a description of class InchWormTesterFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InchWormTesterFinal
{
   public static void main(String[] args)
   {
      //default constructor
       InchWorm worm1 = new InchWorm();
       System.out.println(worm1.getPosition());
       System.out.println("Expected: 0");
       worm1.move();
       worm1.move();
       worm1.turn();
       worm1.move();
       System.out.println(worm1.getPosition());
       System.out.println("Expected: 1");
       
       //default constructor
       InchWorm worm2 = new InchWorm(10);
       worm2.move();
       worm2.move();
       worm2.move();
       worm2.move();
       System.out.println(worm2.getPosition());
       System.out.println("Expected: 14");
       worm2.turn();
       worm2.move();
       worm2.move();
       worm2.turn();
       worm2.move();
       System.out.println(worm2.getPosition());
       System.out.println("Expected: 13");
       
   }

}
