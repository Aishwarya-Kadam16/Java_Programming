import java.util.Scanner;

class Marvellous
{
    public long MultFact(int iNo)
    {
        int iCnt = 0;
        long lFact = 0L;

        lFact = 1;
        for(iCnt = 1;iCnt<=iNo;iCnt++)
        {
            lFact = lFact * iCnt;
        }

        return lFact;
    }
}
class Practice1 
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        long lRet = 0L;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        lRet = mobj.MultFact(iValue);
        
        System.out.println("The multiplcation of factorial is : "+lRet);
    }
}
