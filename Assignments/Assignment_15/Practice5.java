import java.util.Scanner;

class Marvellous
{
    public int countDiff(int iNo)
    {
        int iDigit = 0,iEvenSum = 0, iOddSum = 0, iDiff = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if((iDigit % 2) == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            
            else if((iDigit % 2) != 0)
            {
                iOddSum = iOddSum + iDigit;
            }
            
            iNo = iNo / 10;
        }
        iDiff = iEvenSum - iOddSum;

        return iDiff;
    }
}
class Practice5
{
    public static void main(String[] args) 
    {
        int iValue = 0,iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        iRet = mobj.countDiff(iValue);

        System.out.println("The difference between even and odd digits are : "+iRet);

        mobj = null;
        sobj = null;
        System.gc();

    }
}
