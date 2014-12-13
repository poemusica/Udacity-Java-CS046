// Ignore this class. It is just here so I can test if you implemented the interface correctly
public class InterfaceTester
{
   public static void main(String[] args)
   {
       GeometricSolid blob = new Blob();
       System.out.println(blob.getSurfaceArea());
       System.out.println("Expected: 0.0");
       System.out.println(blob.getVolume());
       System.out.println("Expected: 0.0");
   }
}
