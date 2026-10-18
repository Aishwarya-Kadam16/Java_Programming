import java.util.Scanner;

class Marvellous
{
    public void displayEven(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1;iCnt <= (iNo*2);iCnt++)
        {
            if((iCnt%2)==0)
            {
                System.out.println(iCnt);
            }
        }
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
        mobj.displayEven(iValue);

    }
}
