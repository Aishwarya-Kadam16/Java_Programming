//I : 5 , Output = 5*4*3*2*1 = 120

import java.util.Scanner;

class Digits
{
    public void displayDigits(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;

            System.out.println(iDigit);
        }

    }
    
}

class program90
{
    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        dobj.displayDigits(iValue);

        dobj = null;
        sobj = null;

        System.gc();
    }
}
