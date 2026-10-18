import java.util.Scanner;

class Marvellous
{
    public int factDiff(int iNo)
    {
        int iCnt = 0, iSumFact = 0,iSumNonFact=0,iDiff = 0;

        for(iCnt = 1;iCnt<iNo;iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSumFact = iSumFact + iCnt;
            } 

            if((iNo % iCnt) != 0)
            {
                iSumNonFact = iSumNonFact + iCnt;
            }
        }
        iDiff = iSumFact - iSumNonFact;

        return iDiff;
    }
}
class Practice5
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        iRet = mobj.factDiff(iValue);

        System.out.println("Difference between factors and non factors : "+iRet);
    
    }
}
