import java.util.Scanner;

class Logic
{
    public int findSmallestDigit(int iNo)
    {
        int iDigit = 0, iMin = Integer.MAX_VALUE;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit < iMin)
            {
                iMin = iDigit;
            }

            iNo = iNo / 10;
        }

        return iMin;
        
    }
}   
class Practice5
{
    public static void main(String[] args) 
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.findSmallestDigit(iValue);

        System.out.println(iRet+" is a smallest digit");
        
        lobj = null;
        sobj = null;
        System.gc();
    }
}
