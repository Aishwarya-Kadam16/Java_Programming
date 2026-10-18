import java.util.Scanner;
class Marvellous
{
    public boolean  check(int iNo)
    {
        if((iNo % 5)==0)
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}
class Practice4
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        bRet = mobj.check(iValue);

        if(bRet)
        {
            System.out.println(iValue +" is divisible by 5");
        }

        else
        {
            System.out.println(iValue +" is not divisible by 5");
        }

        mobj = null;
        sobj = null;
        System.gc();

    }
}