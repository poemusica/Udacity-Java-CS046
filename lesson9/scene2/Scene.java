// BlueJ project: lesson9/scene2

import java.util.ArrayList;

public class Scene
{
    public static void main(String[] args)
    {
        // TODO: Change to an ArrayList<Drawable>

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car(100, 300));
        cars.add(new Car(250, 300));
        cars.add(new Car(250, 350));

        ArrayList<House> houses = new ArrayList<House>();
        houses.add(new House(100, 150, 100, 100));
        houses.add(new House(250, 100, 150, 150));

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog(200, 100, "Fido.jpg"));
        dogs.add(new Dog(100, 400, "Rex.jpg"));
        dogs.add(new Dog(200, 400, "Lucky.jpg"));

        // TODO: Change to a single loop
        for (Car c : cars)
        {
            c.draw();
        }
        for (House h : houses)
        {
            h.draw();
        }
        for (Dog d : dogs)
        {
            d.draw();
        }
    }
}
