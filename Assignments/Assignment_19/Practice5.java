import java.util.Scanner;

class Logic
{
    public int calculatePower(int iBase, int iExp)
    {
        int iCnt = 0,iPower = 1;

        for(iCnt = 1; iCnt <= iExp; iCnt++)
        {
            iPower = iPower * iBase;
        }

        return iPower;
    }
}
class Practice5
{
    public static void main(String[] args) 
    {
        int iValue1 = 0, iValue2 = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Base : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Exponential Number : ");
        iValue2 = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.calculatePower(iValue1, iValue2);
        
        System.out.println("The power of a number is : "+iRet);
        lobj = null;
        sobj = null;
        System.gc();
    }
}
