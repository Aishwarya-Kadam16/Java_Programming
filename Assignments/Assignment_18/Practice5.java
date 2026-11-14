import java.util.Scanner;

class Logic
{
    public void checkSign(int iNo)
    {
        if(iNo > 0)
        {
            System.out.println(iNo+" is Positive number");
        }

        else if(iNo < 0)
        {
            System.out.println(iNo+" is Negative number");
        }

        else if(iNo == 0)
        {
            System.out.println("The number is Zero");
        }
    }
}
class Practice5
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.checkSign(iValue);
        

        lobj = null;
        sobj = null;
        System.gc();
    }
}
