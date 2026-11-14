import java.util.Scanner;

class Logic
{
    public int findMax(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            return iNo1;
        }

        else
        {
            return iNo2;
        }
        
    }
}
class Practice3 
{
    public static void main(String[] args) 
    {
        int iValue1 = 0, iValue2 = 0, iRet = 0;
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the second number : ");
        iValue2 = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.findMax(iValue1, iValue2);

        System.out.println(iRet+" is a maximum number");

        lobj = null;
        sobj = null;
        System.gc();

    }
}
