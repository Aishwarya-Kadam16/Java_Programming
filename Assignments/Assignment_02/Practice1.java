import java.util.Scanner;
class Marvellous
{
    public void display(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        iCnt = 1;
        while(iCnt<=iNo)
        {
            System.out.print("*\t");
            iCnt++;
        }
        System.out.println("");
    }
}
class Practice1
{
    public static void main(String[] args) 
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