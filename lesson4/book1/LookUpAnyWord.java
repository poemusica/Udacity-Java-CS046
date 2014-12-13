import java.util.Scanner;

public class LookUpAnyWord
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a word and press enter and I'll tell you how many times it appears in \n"
        + "Alice in Wonderland: ");
        String word = in.next();
        System.out.println();
        
        Book aliceInWonderland = new Book("aliceInWonderland.txt");
        int occurrences = aliceInWonderland.occurrencesOf(word);
        System.out.println(word + " occurrs " + occurrences + " times!");
    }
}
