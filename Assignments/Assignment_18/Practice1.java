import java.util.Scanner;

class Logic
{
    public boolean checkPrime(int iNo)
    {
        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt = 2; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;
    }
}
class Practice1 
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        bRet = lobj.checkPrime(iValue);

        if(bRet)
        {
            System.out.println(iValue+" is not a prime number");
        }

        else
        {
            System.out.println(iValue+" is a prime number");
        }

        lobj = null;
        sobj = null;
        System.gc();
    }
}
