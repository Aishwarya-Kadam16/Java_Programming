import java.util.Scanner;

class Marvellous
{
    public void oddDisplay(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1;iCnt<=iNo;iCnt++)
        {
            if((iCnt % 2) != 0)
            System.out.print(iCnt+"\t");
        }

        
    }
}

class Practice4
{
    public static void main(String Args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        mobj.oddDisplay(iValue);

        mobj = null;
        sobj = null;
        System.gc();
    }
}