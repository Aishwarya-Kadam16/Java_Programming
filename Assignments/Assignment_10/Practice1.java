import java.util.Scanner;

class Marvellous
{
    public double  circleArea(float fRadius)
    {
        double dArea = 0.0;

        dArea = 3.14 * fRadius * fRadius;

        return dArea;
    }
}
class Practice1 
{
    public static void main(String[] args) 
    {
        float fValue = 0.0f;
        double dRet = 0.0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the radius : ");
        fValue = sobj.nextFloat();

        Marvellous mobj = new Marvellous();
        dRet = mobj.circleArea(fValue);

        System.out.println("The area of circle is : "+dRet);

        mobj = null;
        sobj = null;
        System.gc();

    }
}
