public class RectangleDemo
{
    public static void main(String[] args)
    {
        Rectangle box1 = new Rectangle(60, 90, 20, 30);
        Rectangle box2 = new Rectangle(60, 90, 20, 30);
        box2.translate(20, 30);
        box1.draw();
        box2.draw();
    }
}
