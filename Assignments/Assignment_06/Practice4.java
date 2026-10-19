import java.util.Scanner;

class Marvellous
{
    public int multiply(int iNo1, int iNo2,int iNo3)
    {
        int iAns = 0;

        iAns = iNo1 * iNo2 * iNo3;

        return iAns;
    }
}
class Practice4
{
    public static void main(String[] args) 
    {
        int iValue1 = 0, iValue2 = 0, iValue3 = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter third number : ");
        iValue3 = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        iRet = mobj.multiply(iValue1, iValue2,iValue3);

        
        System.out.println("Multiplication is : "+iRet);
        

        mobj = null;
        sobj = null;

        System.gc();
    }
}
