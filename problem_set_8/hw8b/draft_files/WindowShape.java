//Java Windows makes stain class windows of one particular shape. The windows are
//rectangular with a semi-circle on top. You are given the beginning of a class
//WindowShape to model a window of that shape. You are to provide two methods
//that can be used to calculate area. That will tell us how much glass we will need.
//Provide an instance method area() that returns the area of the window that called it.
//(we would use this if we already had the WindowShape object and wanted its area)

//Provide a static method area() that takes the width and height of the rectangular part
//of the window and returens the area of the entire window - including the semi-circle
//on top.
//(we would use this method if we didn't have a WindowShape object and did not need
//to create on)

//You are not given these method headers in this exercise. That is part of what you
//need to figure out.

//Use Math.PI

// You can see the shape by looking at stained_glass_window_8b.png
// which is in this project's folder.

//For the draft, provide the instance method.

/**
 * Models a window of a particular shape - namely a rectangle with a semi-circle on top
 */
public class WindowShape
{

    private double w;
    private double h;

    /**
     * Constructor for objects of class WindowShape
     * @param width the width of the rectangle and diameter of the semi-circle
     * @param height the height of the rectangle alone
     */
    public WindowShape(double width, double height)
    {
        w = width;
        h = height;
    }

    /**
     * Gets the width of this shape
     * @return the width
     */
    public double getWidth()
    {
       return w;
    }

    /**
     * Gets the height of this shape
     * @return the height
     */
    public double getHeight()
    {
        return h;
    }

    // other methods for dealing with windows ...

    // TODO: Write an instance method to get the area of the shape

    // TODO: Write a static method that takes the width and height of the rectangle
    // as parameters and returns the area of a rectangle wiht those dimensions and with a
    // semi-circle on top.
}
