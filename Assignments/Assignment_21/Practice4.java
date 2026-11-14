import java.util.Scanner;

class Logic
{
    public int countFacors(int iNo)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iCount++;
            }
        }

        return iCount;
    }
}
class Practice4
{
    public static void main(String Args[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.countFacors(iValue);

        System.out.println("The count of factors for "+iValue + " is : "+iRet);
        lobj = null;
        sobj = null;
        System.gc();
    }
}
