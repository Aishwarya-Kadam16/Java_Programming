import java.util.Scanner;

class Marvellous 
{
    public long evenFactorial(int iNo)
    {
        int iCnt = 0;
        long lFact = 0L;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        lFact = 1;
        for(iCnt = 1; iCnt <= iNo;iCnt++)
        {
            if((iCnt % 2)==0)
            {
                System.out.print(iCnt+"\t");
                lFact = lFact * iCnt;
            }
        }
        System.out.println("");
        
        return lFact;
    }
}
class Practice3
{
    public static void main(String Args[])
    {
        int iValue = 0;
        long lRet = 0L;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        lRet = mobj.evenFactorial(iValue);

        System.out.println(iValue+"'s even factorial is : "+lRet);
        mobj = null;
        sobj = null;
        System.gc();

    }
}