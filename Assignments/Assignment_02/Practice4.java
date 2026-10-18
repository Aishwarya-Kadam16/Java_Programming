import java.util.Scanner;

class Marvellous
{
    public void display(int iNo1, int iNo2)
    {
        int iCnt = 0;

        for(iCnt = 1;iCnt<=iNo2;iCnt++)
        {
            System.out.print(iNo1+"\t");
        }
    }
}
class Practice4
{
    public static void main(String[] args) 
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        mobj.display(iValue1,iValue2);

        
        mobj = null;
        sobj = null;
        System.gc();

    }
}