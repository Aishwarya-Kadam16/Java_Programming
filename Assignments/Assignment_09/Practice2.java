import java.util.Scanner;

class Marvellous 
{
    public int dollerToINR(int iNo)
    {
        int iDoller = 0;

        iDoller = iNo * 70;

        
        return iDoller;
        
    }
}
class Practice2
{
    public static void main(String Args[])
    {
        int iValue = 0,iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of USD: ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        iRet = mobj.dollerToINR(iValue);

        System.out.println("Value in INR is : "+iRet);

        mobj = null;
        sobj = null;
        System.gc();

    }
}