import java.util.Scanner;

class Logic
{
    public void printDivisibleBy2and3(int iNo)
    {
        int iCnt = 0, iCount = 0;

        System.out.println("The numbers which are divisible by 2 and 3 are in between 1 to "+iNo+" are : ");
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2) == 0 && (iCnt % 3)==0)
            {
                System.out.println(iCnt);
            } 
        }
    }
}
class Practice5
{
    public static void main(String Args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.printDivisibleBy2and3(iValue);

        lobj = null;
        sobj = null;
        System.gc();
    }
}
