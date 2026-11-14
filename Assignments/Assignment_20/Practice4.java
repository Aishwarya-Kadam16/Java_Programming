import java.util.Scanner;

class Logic
{
    public int findLargestDigit(int iNo)
    {
        int iDigit = 0, iMax = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit > iMax)
            {
                iMax = iDigit;
            }

            iNo = iNo / 10;
        }

        return iMax;
        
    }
}   
class Practice4
{
    public static void main(String[] args) 
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.findLargestDigit(iValue);

        System.out.println(iRet+" is a largest digit");
        
        lobj = null;
        sobj = null;
        System.gc();
    }
}
