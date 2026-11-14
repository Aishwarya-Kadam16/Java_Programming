import java.util.Scanner;

class Logic
{
    public int calculateSum(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1;iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
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
        iRet = lobj.calculateSum(iValue);

        System.out.println("The addition is : "+iRet);

        lobj = null;
        sobj = null;
        System.gc();

    }
}
