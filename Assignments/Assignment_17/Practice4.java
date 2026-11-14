import java.util.Scanner;

class Logic
{
    public int findMin(int iNo1, int iNo2, int iNo3)
    {
        if(iNo1 < iNo2 && iNo1 < iNo3)
        {
            return iNo1;
        }

        else if(iNo2 < iNo1 && iNo2 < iNo3)
        {
            return iNo2;
        }

        else
        {
            return iNo3;
        }
        
    }
}
class Practice4 
{
    public static void main(String[] args) 
    {
        int iValue1 = 0, iValue2 = 0,iValue3 = 0, iRet = 0;
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the second number : ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter the three number : ");
        iValue3 = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.findMin(iValue1, iValue2, iValue3);

        System.out.println(iRet+" is a minimum number");

        lobj = null;
        sobj = null;
        System.gc();

    }
}
