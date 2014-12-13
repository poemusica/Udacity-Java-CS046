
public class AmplifierTester
{
    public static void main(String[] args)
    {
        //test InvertingAmplifier
        Amplifier amp = new InvertingAmplifier(5500, 10000);
        System.out.printf("%.2f\n", amp.getGain());
        System.out.println("Expected: 1.82");

        amp.setR1(3000);
        amp.setR2(11000);
        System.out.printf("%.2f\n", amp.getGain());
        System.out.println("Expected: 3.67");


    }
}
