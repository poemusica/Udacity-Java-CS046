import java.util.ArrayList;
import java.util.Collections;
public class ComparableDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> strings = new ArrayList();
        strings.add("Antelope");
        strings.add("Hippo");
        strings.add("Pronghorn");
        strings.add("Capybara");
        strings.add("Rhinoceros");
        strings.add("Leopard");
        strings.add("Wolf");
        strings.add("Tortoise");
        strings.add("Camel");
        strings.add("Sloth Bear");
        strings.add("Panda");

        Collections.sort(strings);
        System.out.println(strings);
    }
}
