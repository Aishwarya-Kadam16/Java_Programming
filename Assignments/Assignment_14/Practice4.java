import java.util.Scanner;

class Marvellous
{
    public int countFour(int iNo)
    {
        int iDigit = 0, iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 4)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }

        return iCount;
    }
}
class Practice4
{
    public static void main(String[] args) 
    {
        int iValue = 0,iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        iRet = mobj.countFour(iValue);

        System.out.println("The count of FOUR in "+iValue+ " is "+iRet);

        mobj = null;
        sobj = null;
        System.gc();

    }
}
