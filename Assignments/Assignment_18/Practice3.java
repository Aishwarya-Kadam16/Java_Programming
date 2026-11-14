import java.util.Scanner;

class Logic
{
    public void printOddNumbers(int iNo)
    {
        int iCnt = 0;

        System.out.println("The odd numbers are : ");
        for(iCnt = 1;iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2) == 1)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class Practice3 
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.printOddNumbers(iValue);

        lobj = null;
        sobj = null;
        System.gc();
    }
}
