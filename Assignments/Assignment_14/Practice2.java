import java.util.Scanner;

class Marvellous
{
    public boolean checkZero(int iNo)
    {
        int iDigit = 0;
        boolean bFlag = false;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 0)
            {
                bFlag = true;
                break;
            }

            iNo = iNo / 10;
        }

        return bFlag;
    }
}
class Practice2
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        bRet = mobj.checkZero(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+ " contains Zero");
        }

        else
        {
            System.out.println("There is no zero");
        }
        mobj = null;
        sobj = null;
        System.gc();

    }
}
