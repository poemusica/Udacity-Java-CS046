public class Negative
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.pick();
        pic.pause();
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.negative();
            pic.setColorAt(i, c);
        }
    }
}
