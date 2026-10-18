//I : 5 , Output = 5*4*3*2*1 = 120

import java.util.Scanner;

class Number
{
    public long calculateFactorial(int iNo)
    {
        int iCnt = 0;
        //important
        long lFact = 0L;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        lFact = 1;
        for(iCnt = 1;iCnt<=iNo;iCnt++)
        {
            lFact = lFact * iCnt;
        }

        return lFact;
    }
    
}

class program88
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        long lRet = 0L;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        lRet = nobj.calculateFactorial(iValue);

        System.out.println("The factorial of "+iValue +" is : "+lRet);

        nobj = null;
        sobj = null;

        System.gc();
    }
}
