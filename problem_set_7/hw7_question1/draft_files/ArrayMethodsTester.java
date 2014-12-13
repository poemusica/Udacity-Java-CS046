import java.util.ArrayList;
public class ArrayMethodsTester
{
    public static void main(String[] args)
    {
        //set up
        String[] animals = {"ape", "dog", "zebra"};
        ArrayMethods zoo = new ArrayMethods(animals); 
        
        //test isSorted
        System.out.println(zoo.isSorted());
        System.out.println("Expected: true");
        
        String[] animals2 = {"ape", "dog", "zebra", "cat"};
        zoo = new ArrayMethods(animals2);         
        System.out.println(zoo.isSorted());
        System.out.println("Expected: false");
        
        String[] animals3 = {"cat", "ape", "dog", "zebra"};
        zoo = new ArrayMethods(animals3); ;
        System.out.println(zoo.isSorted());
        System.out.println("Expected: false");
    }
}
