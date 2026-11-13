import java.util.Scanner;

class Marvellous
{
    public int KMtoMeter(int iNo)
    {
        int iKilometer = 0;

        iKilometer = iNo * 1000;

        return iKilometer;
    }

    
}
class Practice3
{
    public static void main(String[] args) 
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the distance : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        iRet = mobj.KMtoMeter(iValue);

        System.out.println("The "+ iValue +" kilometer is "+iRet+" meter");

        mobj = null;
        sobj = null;
        System.gc();
    }
}
