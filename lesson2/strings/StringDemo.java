public class StringDemo
{
    public static void main(String[] args)
    {
        String river = "Mississippi";
       // System.out.println(river.replace('i', 'x'));
        System.out.println(river.toUpperCase());
        System.out.println(river.toLowerCase());
        System.out.println(river.toUpperCase().toLowerCase());
        System.out.println(river);
        
       
        String messyString = " Hello, Space! ";
        System.out.println(messyString.trim());
    }
}