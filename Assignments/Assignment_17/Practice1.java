import java.util.Scanner;

class Logic
{
    public int sumOfDigits(int iNo)
    {
        int iDigit=0, iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iDigit;

            iNo = iNo / 10;
        }

        return iSum;
    }
}
class Practice1 
{
    public static void main(String[] args) 
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.sumOfDigits(iValue);

        System.out.println("The sum of digits are : "+iRet);

        lobj = null;
        sobj = null;
        System.gc();

    }
}
