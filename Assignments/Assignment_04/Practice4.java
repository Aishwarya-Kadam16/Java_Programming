import java.util.Scanner;

class Marvellous
{
    public int sumNonFact(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1;iCnt<iNo;iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iSum = iSum + iCnt;
            }
        }


        return iSum;
    }
}
class Practice4
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        iRet = mobj.sumNonFact(iValue);

        System.out.println("Summetion of non fact is : "+iRet);
    
    }
}
