// BlueJ project: lesson9/scene5
import java.util.ArrayList;

public class Scene
{
    public static void main(String[] args)
    {
        ArrayList<Drawable> elements = new ArrayList<Drawable>();
        elements.add(new Car(100, 300));
        elements.add(new Car(250, 300));
        elements.add(new Car(250, 350));

        elements.add(new House(100, 150, 100, 100));
        elements.add(new House(250, 100, 150, 150));

        elements.add(new Dog(200, 100, "Fido.jpg"));
        elements.add(new Dog(100, 400, "Rex.jpg"));
        elements.add(new Dog(200, 400, "Lucky.jpg"));

        for (Drawable d : elements)
        {
            d.draw();
        }

        for (int i = 1; i <= 10; i++)
        {
            for (Drawable d : elements)
            {
                // TODO: Move those elements that are moveable for 1 second each
            }
            Canvas.snapshot();
        }
    }
}
