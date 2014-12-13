// BlueJ project: lesson9/scene3
// TODO: Make this ball drawable.
// To draw it, simply fill the shape.

public class Ball
{
    private Ellipse shape;

    /**
       Constructs a ball.
       @param xLeft the leftmost x-coordinate of this ball.
       @param yTop the topmost y-coordinate of this ball.
       @param color the color of this ball.
    */
    public Ball(int xLeft, int yTop, Color color)
    {
        final int DIAMETER = 40;
        shape = new Ellipse(xLeft, yTop, DIAMETER, DIAMETER);
        shape.setColor(color);
    }

}
