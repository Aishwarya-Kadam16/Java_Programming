import java.util.Scanner;

class Logic
{
    public void checkEvenOdd(int iNo)
    {
        

        if((iNo % 2)==0)
        {
            System.out.println("The "+iNo+ " is a Even number");
        }

        else
        {
            System.out.println("The "+iNo+ " is a odd number");
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
        lobj.checkEvenOdd(iValue);

        lobj = null;
        sobj = null;
        System.gc();

    }
}
