import java.util.Scanner;

class Marvellous
{
    public boolean checkGreater(int iNo)
    {
        if(iNo > 100)
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}
class Practice2 
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        bRet = mobj.checkGreater(iValue);

        if(bRet)
        {
            System.out.println(iValue+" is greater than 100");
        }

        else
        {
            System.out.println(iValue+" is less than 100");
        }

        mobj = null;
        sobj = null;

        System.gc();
    }
}
