import java.util.Scanner;

class Marvellous
{
    public boolean checkEqual(int iNo1, int iNo2)
    {
        if(iNo1 == iNo2)
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
        int iValue1 = 0, iValue2 = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        bRet = mobj.checkEqual(iValue1, iValue2);

        if(bRet)
        {
            System.out.println(iValue1+" is equal to "+iValue2);
        }

        else
        {
            System.out.println(iValue1+" is not equal to "+iValue2);
        }

        mobj = null;
        sobj = null;

        System.gc();
    }
}
