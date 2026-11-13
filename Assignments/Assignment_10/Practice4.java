import java.util.Scanner;

class Marvellous 
{
    public double fhtoCS(float fTemp)
    {
        double dCelcius = 0.0;

        dCelcius = ((fTemp - 32) * (0.555555));

        return dCelcius;
    }
}
class Practice4 
{
    public static void main(String[] args) 
    {
        float fValue = 0.0f;
        double dRet = 0.0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit : ");
        fValue = sobj.nextFloat();

        Marvellous mobj = new Marvellous();
        dRet = mobj.fhtoCS(fValue);

        System.out.println("The temperature in celcius is : "+dRet);

        mobj = null;
        sobj = null;
        System.gc();

    }
}
