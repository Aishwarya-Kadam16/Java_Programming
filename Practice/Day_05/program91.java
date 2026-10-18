//I : 5 , Output = 5*4*3*2*1 = 120

import java.util.Scanner;

class Digits
{
    public int sumDigits(int iNo)
    {
        int iDigit = 0,iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        return iSum;
    }
    
}

class program91
{
    public static void main(String[] args) 
    {
        int iValue = 0,iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.sumDigits(iValue);

        System.out.println("Addition of digits are : "+iRet);

        dobj = null;
        sobj = null;

        System.gc();
    }
}
