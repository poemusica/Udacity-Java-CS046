import java.awt.Point;
public class RandomWalkTester
{
    public static void main(String[] args)
    {   

        Robot robby = new Robot(100,100);


        Point end = robby.getLocation();
        System.out.println("X: " + end.getX());
        System.out.println("Expected: 100.0");
        System.out.println( "Y: " + end.getY());
        System.out.println("Expected: 100.0");

        robby = new Robot(10, 5);
        end = robby.getLocation();
        System.out.println("X: " + end.getX());
        System.out.println("Expected: 10.0");
        System.out.println( "Y: " + end.getY());
        System.out.println("Expected: 5.0");
    }


}
