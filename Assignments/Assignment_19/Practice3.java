import java.util.Scanner;

class Logic
{
    public boolean checkDivisible(int iNo)
    {

        boolean bFlag = false;
        if((iNo % 5) == 0 && (iNo % 11)==0)
        {
            bFlag = true;
        }

        return bFlag;
    }
}
class Practice3
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        bRet = lobj.checkDivisible(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is divisible by 5 and 11");
        }

        else
        {
            System.out.println(iValue+" is not divisible by 5 and 11");
        }
        
        lobj = null;
        sobj = null;
        System.gc();
    }
}
