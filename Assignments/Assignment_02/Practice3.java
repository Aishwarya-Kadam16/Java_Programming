import java.util.Scanner;

class Marvellous
{
    public void display(int iNo)
    {
        if(iNo < 10)
        {
            System.out.println("Hello");
        }

        else
        {
            System.out.println("Demo");
        }
    }
}
class Practice3
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