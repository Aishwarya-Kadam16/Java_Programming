import java.util.Scanner;

class Logic
{
    public boolean checkLeapYear(int iNo)
    {
        boolean bFlag = false;
        if(((iNo % 400) == 0  && (iNo % 4) == 0) || (iNo % 100) != 0)
        {
            bFlag = true;
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

        System.out.println("Enter the year : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        bRet = lobj.checkLeapYear(iValue);

        if(bRet)
        {
            System.out.println(iValue+" year is a leap year");
        }

        else
        {
            System.out.println(iValue+" year is not a leap year");
        }
        lobj = null;
        sobj = null;
        System.gc();
    }
}
