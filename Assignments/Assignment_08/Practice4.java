import java.util.Scanner;

class Marvellous 
{
    public void displayTable(int iNo)
    {
        int iCnt = 0;

        for(iCnt=iNo;iCnt<=(iNo*10);iCnt++)
        {
            if((iCnt % iNo) == 0)
            {
                System.out.print(iCnt+"\t");
            }
        }

    }
}   
class Practice4
{
    public static void main(String Args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        mobj. displayTable(iValue);

        mobj = null;
        sobj = null;
        System.gc();

    }
}