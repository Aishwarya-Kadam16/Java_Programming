import java.util.Scanner;

class Logic
{
    public boolean checkPalindrome(int iNo)
    {
        int iDigit = 0,iRev = 0;
        int temp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iNo = iNo / 10;

            iRev = iRev * 10 + iDigit;
            
        }

        
        if(temp == iRev)
        {
            return true;
        }

        else
        {
            return false;
        }
        
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

        Logic lobj = new Logic();
        bRet = lobj.checkPalindrome(iValue);

        if(bRet)
        {
            System.out.println(iValue+" is a palindrome number");
        }

        else
        {
            System.out.println(iValue+" is not a palindrome number");
        }

        lobj = null;
        sobj = null;
        System.gc();

    }
}
