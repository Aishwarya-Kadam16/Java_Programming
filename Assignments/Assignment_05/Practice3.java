import java.util.Scanner;

class Marvellous
{
    public boolean checkLeapYear(int iNo)
    {
        if((iNo % 4)==0 || (iNo % 400)==0 && (iNo % 100) ==0)
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}

class Practice3
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter the year : ");
        iValue = sobj.nextInt();


        Marvellous mobj = new Marvellous();
        bRet = mobj.checkLeapYear(iValue);

        if(bRet)
        {
            System.out.println(iValue+ " is a leap year");
        }

        else
        {
            System.out.println(iValue+ " is a not leap year");
        }
    }
}
