import java.util.Scanner;

class Logic
{
    public int findFactorial(int iNo)
    {
        int iCnt = 0, iFact = 1;

        for(iCnt = 1;iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }

        return iFact;
          
    }
}
class Practice3
{
    public static void main(String[] args) 
    {
        int iValue = 0,iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.findFactorial(iValue);

        System.out.println("The factorial of "+iValue +" is : "+iRet);

        lobj = null;
        sobj = null;
        System.gc();

    }
}
