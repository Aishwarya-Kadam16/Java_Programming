import java.util.Scanner;

class Division
{
    public int divide(int iNo1, int iNo2)
    {
        int iAns = 0;

        if(iNo2 > iNo1)
        {
            return -1;
        }

        iAns = iNo1/iNo2;

        return iAns;
    }
}
class Practice1
{
    public static void main(String[] args) 
    {
        int iValue1 = 0, iValue2 =0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        Division dobj = new Division();
        iRet = dobj.divide(iValue1, iValue2);

        System.out.println("The division is : "+iRet);

    }
}