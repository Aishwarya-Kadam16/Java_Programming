import java.util.Scanner;

class Marvellous 
{
    public long factorialDiff(int iNo)
    {
        int iCnt = 0;
        long evenFact = 0L, oddFact = 0L, diffFact = 0L;

        evenFact = 1;
        oddFact = 1;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        
        for(iCnt = 1; iCnt <= iNo;iCnt++)
        {
            if((iCnt % 2)==0)
            {
                
                evenFact = evenFact * iCnt;
            }

            if((iCnt % 2)!=0)
            {
                
                oddFact = oddFact * iCnt;
            }
        }
        System.out.println("Even Factorial : "+evenFact);
        System.out.println("Odd Factorial : "+oddFact);
        
        diffFact = evenFact - oddFact;
        return diffFact;
    }
}
class Practice5
{
    public static void main(String Args[])
    {
        int iValue = 0;
        long lRet = 0L;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        lRet = mobj.factorialDiff(iValue);

        System.out.println("The diff between Even & Odd factorial is : "+lRet);
        mobj = null;
        sobj = null;
        System.gc();

    }
}