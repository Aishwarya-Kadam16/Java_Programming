import java.util.Scanner;

class Marvellous
{
    public int countRange(int iNo)
    {
        int iDigit = 0,iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if((iDigit >=3 ) && (iDigit <= 7))
            {
                iCount++;
            }
            
            iNo = iNo / 10;
        }
        return iCount;
    }
}
class Practice3
{
    public static void main(String[] args) 
    {
        int iValue = 0,iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        iRet = mobj.countRange(iValue);

        System.out.println("The count of digits between 3 and 7 are : "+iRet);

        mobj = null;
        sobj = null;
        System.gc();

    }
}
