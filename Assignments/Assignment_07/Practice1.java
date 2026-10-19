import java.util.Scanner;

class Marvellous
{
    public void displayPattern(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1;iCnt<=(iNo);iCnt++)
        {
            System.out.print("$\t*\t");
        }
    }
}

class Practice1
{
    public static void main(String Args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        mobj.displayPattern(iValue);


    }
}