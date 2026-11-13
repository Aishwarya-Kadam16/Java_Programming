import java.util.Scanner;

class Marvellous
{
    public int countFactors(int iNo)
    {
        int iCnt = 0,iCount = 0;
        
        for(iCnt = 1;iCnt<=(iNo / 2);iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iCount++;
            }
        }

        return iCount;
    }
}   //Time Complexity : O(N/2)
class Practice2
{
    public static void main(String[] args) 
    {
        int iValue = 0,iRet = 0;


        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        iRet = mobj.countFactors(iValue);

        System.out.println("The total count of factors are : "+iRet);
        mobj = null;
        sobj = null;
        System.gc();
    }
}
