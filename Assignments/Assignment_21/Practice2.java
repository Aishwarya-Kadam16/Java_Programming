import java.util.Scanner;

class Logic
{
    public void countEvenOddRange(int iNo)
    {
        int iCnt = 0, iCountEven = 0, iCountOdd = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iCountEven++;
            }

            else if((iCnt % 2) != 0)
            {
                iCountOdd++;
            }
        }

        System.out.println("The count of even numbers in between 1 to " +iNo+" are : "+iCountEven);

        System.out.println("The count of odd numbers in between 1 to " +iNo+" are : "+iCountOdd);
    }
}
class Practice2 
{
    public static void main(String Args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.countEvenOddRange(iValue);

        lobj = null;
        sobj = null;
        System.gc();
    }
}
