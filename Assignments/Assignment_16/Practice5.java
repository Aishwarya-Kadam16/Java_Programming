import java.util.Scanner;

class Logic
{
    public int countDigits(int iNo)
    {
        int iCount = 0;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }  
        
        return iCount;
    }
}
class Practice5
{
    public static void main(String[] args) 
    {
        int iValue = 0,iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.countDigits(iValue);

        System.out.println("The count of digits in "+iValue+ " is : "+iRet);

        lobj = null;
        sobj = null;
        System.gc();
    }
}
