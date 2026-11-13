import java.util.Scanner;

class Marvellous
{
    public int sumEvenNumbers(int iLimit)
    {
        int iCnt = 0, iSum = 0;

        if(iLimit < 0)
        {
            return -1;
        }

        for(iCnt = 1;iCnt <= iLimit; iCnt++)
        {
            if((iCnt % 2)==0)
            {
                iSum = iSum + iCnt;
            }
        }

        return iSum;
    }
}   //Time Complexity = O(N)
class Practice5
{
    public static void main(String[] args) 
    {
        int iValue = 0,iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();

        iRet = mobj.sumEvenNumbers(iValue);

        System.out.println("The sum of even numbers are : "+iRet);
        mobj = null;
        sobj = null;
        System.gc();
    }
}