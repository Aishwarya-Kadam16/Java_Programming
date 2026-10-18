import java.util.Scanner;

class Marvellous
{
    public boolean checkEvenOdd(int iNo)
    {
        if((iNo % 2) == 0)
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}
class Practice5
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        bRet = mobj.checkEvenOdd(iValue);

        if(bRet)
        {
            System.out.println(iValue+" is even");
        }

        else
        {
            System.out.println(iValue+" is odd");
        }

        
        mobj = null;
        sobj = null;
        System.gc();

    }
}