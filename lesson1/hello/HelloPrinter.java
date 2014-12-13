public class HelloPrinter
{
    public static void main(String[] args)
    {
        int gas_truck = (50000 /10) * 4;
        int gas_tesla = (50000 / 50) * 4;
        
        int truck_price = 15000 + gas_truck;
        int tesla_price = 30000 + gas_tesla;
        
        System.out.println(truck_price);
        System.out.println(tesla_price);
    }
}
