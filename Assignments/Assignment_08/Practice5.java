
import java.util.Scanner;

class Marvellous 
{
    public void displayRevTable(int iNo)
    {
        int iCnt = 0;

        for(iCnt=iNo*10;iCnt>=(iNo);iCnt--)
        {
            if((iCnt % iNo) == 0)
            {
                System.out.print(iCnt+"\t");
            }
        }

    }
}   
class Practice5
{
    public static void main(String Args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        mobj. displayRevTable(iValue);

        mobj = null;
        sobj = null;
        System.gc();

    }
}