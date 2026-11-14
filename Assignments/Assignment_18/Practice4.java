import java.util.Scanner;

class Logic
{
    public void sumEvenOddDigits(int iNo)
    {
        int iDigit = 0, iEvenSum = 0, iOddSum = 0;

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

        System.out.println("The sum of even Digits are : "+iEvenSum);
        System.out.println("The sum of odd Digits are : "+iOddSum);
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

        Logic lobj = new Logic();
        lobj.sumEvenOddDigits(iValue);
        

        lobj = null;
        sobj = null;
        System.gc();
    }
}
