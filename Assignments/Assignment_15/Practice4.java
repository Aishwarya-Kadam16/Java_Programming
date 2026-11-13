import java.util.Scanner;

class Marvellous
{
    public int countRange(int iNo)
    {
        int iDigit = 0,iMult = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 0)
            {
                iDigit = 1;
            }

            iMult = iMult * iDigit;
            
            iNo = iNo / 10;
        }
        return iMult;
    }
}
class Practice4
{
    public static void main(String[] args) 
    {
        int iValue = 0,iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        iRet = mobj.countRange(iValue);

        System.out.println("The multiplication of all digits are : "+iRet);

        mobj = null;
        sobj = null;
        System.gc();

    }
}
