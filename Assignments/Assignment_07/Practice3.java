import java.util.Scanner;

class Marvellous
{
    public void display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = (-iNo);iCnt<=0;iCnt++)
        {
            System.out.print(iCnt+"\t");
        }

        for(iCnt = 1;iCnt<=iNo;iCnt++)
        {
            System.out.print(iCnt+"\t");
        }
    }
}

class Practice3
{
    public static void main(String Args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        mobj.display(iValue);

        mobj = null;
        sobj = null;
        System.gc();
    }
}