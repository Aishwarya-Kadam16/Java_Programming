import java.util.Scanner;

class Logic
{
    public int sumEvenNumbers(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo;iCnt++)
        {
            if((iCnt % 2)==0)
            {
                iSum = iSum + iCnt;
            }
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
        iRet = lobj.sumEvenNumbers(iValue);

        System.out.println("The sum of even numbers is : "+iRet);

        lobj = null;
        sobj = null;
        System.gc();
    }
}
