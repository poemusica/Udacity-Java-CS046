public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("aliceInWonderland.txt");

        System.out.println(alice.occurrencesOfAlice());
        System.out.println("Expected: 395");

        Book mary = new Book("mary.txt");

        System.out.println(mary.occurrencesOfAlice());
        System.out.println("Expected: 0");
    }
}
