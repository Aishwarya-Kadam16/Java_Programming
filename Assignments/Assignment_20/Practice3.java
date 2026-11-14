import java.util.Scanner;

class Logic
{
    public boolean checkPerfect(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1;iCnt <= (iNo/2); iCnt++)
        {
            if((iNo %iCnt) ==0)
            {
                iSum = iSum + iCnt;
            }
        }
        
        if(iNo == iSum)
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}   //Time complexity = O(N/2)
class Practice3
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        bRet = lobj.checkPerfect(iValue);

        if(bRet)
        {
            System.out.println(iValue+" is a perfect number");
        }

        else
        {
            System.out.println(iValue+" is not a perfect number");
        }
        lobj = null;
        sobj = null;
        System.gc();
    }
}
