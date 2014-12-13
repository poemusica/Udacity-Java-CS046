
public class CountryNameTester
{
   public static void main(String[] args)
   {
       CountryNames tester = new CountryNames();
       System.out.println(tester.getCompleteName("Albanie"));
       System.out.println("Expected: l'Albanie");
       System.out.println(tester.getCompleteName("Estonie"));
       System.out.println("Expected: l'Estonie");
       System.out.println(tester.getCompleteName("Inde"));
       System.out.println("Expected: l'Inde");
       System.out.println(tester.getCompleteName("Oman"));
       System.out.println("Expected: l'Oman");
       System.out.println(tester.getCompleteName("Uruguay"));
       System.out.println("Expected: l'Uruguay");
       System.out.println(tester.getCompleteName("Bolivie"));
       System.out.println("Expected: Bolivie");
   }
}
