import java.util.Scanner;

class Logic
{
    public int productOfDigits(int iNo)
    {
        int iDigit = 0, iProduct = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iProduct = iProduct *iDigit;
            iNo = iNo / 10;

        }
        return iProduct;
    }
}
class Practice1 
{
    public static void main(String Args[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        iRet = lobj.productOfDigits(iValue);

        System.out.println("The product of digits are : "+iRet);

        lobj = null;
        sobj = null;
        System.gc();
    }
}
