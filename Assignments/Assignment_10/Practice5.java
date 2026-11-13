
import java.util.Scanner;

class Marvellous
{
    public double squareMeter(int iNo)
    {
        double sSquareMeter = 0.0;

        sSquareMeter = iNo * 0.0929;

        return sSquareMeter;
    }
}
class Practice5 
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        double dRet = 0.0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the area in square feet : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        dRet = mobj.squareMeter(iValue);

        System.out.println("The area in square meter is : "+dRet);

        mobj = null;
        sobj = null;
        System.gc();

    }
}
