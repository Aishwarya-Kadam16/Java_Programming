import java.util.*;

/*
ALGORITHM
    START
        Step 1 : Accept number from user as No
        Step 2 : Travel the Number from 1 to No/2
        Step 3 : Create another variable as Sum
        Step 4 : Inside loop icheck the No is completely Divisible by that number
        Step 5 : After the end of loop check if the sum is exactly same as No
        Step 6 : then return true 
        Step 7 : otherwise return false
    STOP
*/


class Number 
{
    public boolean checkPerfect(int iNo)
    {

        int iCnt = 0,iSum = 0;
        for(iCnt = 1;iCnt <= (iNo/2);iCnt++)
        {
            if((iNo % iCnt)==0)
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
}
class program79 
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        bRet = nobj.checkPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue +" is a perfect number");
        }

        else
        {
            System.out.println(iValue +" is not a perfect number");
        }

        nobj = null;
        sobj = null;

        System.gc();
    }
}
