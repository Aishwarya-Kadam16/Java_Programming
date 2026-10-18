//I : 5 , Output = 5*4*3*2*1 = 120

import java.util.Scanner;

class Number
{
    public int calculateFactorial(int iNo)
    {
        int iCnt = 0, iFact = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        iFact = 1;
        for(iCnt = 1;iCnt<=iNo;iCnt++)
        {
            iFact = iFact * iCnt;
        }

        return iFact;
    }
    
}

class program87
{
    public static void main(String[] args) 
    {
        int iValue = 0,iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        iRet = nobj.calculateFactorial(iValue);

        System.out.println("The factorial of "+iValue +" is : "+iRet);

        nobj = null;
        sobj = null;

        System.gc();
    }
}
