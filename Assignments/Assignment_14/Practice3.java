import java.util.Scanner;

class Marvellous
{
    public int countTwo(int iNo)
    {
        int iDigit = 0, iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 2)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }

        return iCount;
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

        Marvellous mobj = new Marvellous();
        iRet = mobj.countTwo(iValue);

        System.out.println("The count of TWO in "+iValue+ " is "+iRet);

        mobj = null;
        sobj = null;
        System.gc();

    }
}
