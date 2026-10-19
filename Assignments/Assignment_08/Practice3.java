import java.util.Scanner;

class Marvellous 
{
    public int factorial(int iNo)
    {
        int iCnt = 0, iFact = 0;

        iFact = 1;

        for(iCnt=iNo;iCnt>=1;iCnt--)
        {
            System.out.print(iCnt+"\t");
            iFact = iFact * iCnt;
        }
        System.out.println("");
        
        return iFact;

    }
}   //Time Complexity is : O(N)
class Practice3
{
    public static void main(String Args[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        iRet = mobj.factorial(iValue);

        System.out.println(iValue+"'s Factorial is : "+iRet);
        mobj = null;
        sobj = null;
        System.gc();

    }
}