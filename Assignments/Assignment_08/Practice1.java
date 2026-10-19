import java.util.Scanner;

class Marvellous 
{
    public void number(int iNo)
    {
        if(iNo < 50)
        {
            System.out.println("Small");
        }

        else if(iNo>50 && iNo<100)
        {
            System.out.println("Medium");
        }

        else if(iNo > 100)
        {
            System.out.println("Large");
        }
    }
}
class Practice1
{
    public static void main(String Args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        mobj.number(iValue);

        mobj = null;
        sobj = null;
        System.gc();

    }
}