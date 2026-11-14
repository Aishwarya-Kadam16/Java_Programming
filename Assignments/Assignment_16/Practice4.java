import java.util.Scanner;

class Logic
{
    public void reverseNumber(int iNo)
    {
        int iDigit = 0;

        System.out.println("The reverse number is : ");
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.print(+iDigit);
            iNo = iNo / 10;
        }    
    }
}
class Practice4
{
    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.reverseNumber(iValue);

        lobj = null;
        sobj = null;
        System.gc();
    }
}
