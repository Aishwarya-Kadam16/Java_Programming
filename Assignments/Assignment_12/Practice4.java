import java.util.Scanner;

class Marvellous
{
    public int sumEvenFactors(int iNo)
    {
        int iCnt = 0,iSum = 0;

        if(iNo < 0)
        {
            return -1;
        }

        for(iCnt = 1;iCnt<=(iNo / 2);iCnt++)
        {
            if((iNo % iCnt) == 0 && (iCnt % 2)==0)
            {
                iSum = iSum + iCnt;
            }
        }

        return iSum;
    }
}   //Time Complexity : O(N/2)
class Practice4
{
    public static void main(String[] args) 
    {
        int iValue = 0,iRet = 0;


        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        iRet = mobj.sumEvenFactors(iValue);

        System.out.println("The sum of even factors are : "+iRet);
        mobj = null;
        sobj = null;
        System.gc();
    }
}
