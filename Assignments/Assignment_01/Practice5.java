import java.util.Scanner;
class Marvellous
{
    public void accept(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1;iCnt<=iNo;iCnt++)
        {
            System.out.print("*\t");
        }
        System.out.println("");
    }
}
class Practice5
{
    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        mobj.accept(iValue);

        
        mobj = null;
        sobj = null;
        System.gc();

    }
}