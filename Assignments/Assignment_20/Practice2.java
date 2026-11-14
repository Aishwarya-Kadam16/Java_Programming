import java.util.Scanner;

class Logic
{
    public void printReverse(int iNo)
    {
        int iCnt = 0, iSum = 0;

        System.out.println("The numbers in Reverse Order : ");

        for(iCnt = iNo; iCnt >= 1;iCnt--)
        {
            System.out.println(iCnt);
        }
       
    }
}
class Practice2
{
    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.printReverse(iValue);

        lobj = null;
        sobj = null;
        System.gc();
    }
}
