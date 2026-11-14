import java.util.Scanner;

class Logic
{
    public void printDigits(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            System.out.println(iDigit);
            iNo = iNo /10;
        }
    }
}
class Practice4
{
    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.printDigits(iValue);
        
        lobj = null;
        sobj = null;
        System.gc();
    }
}
