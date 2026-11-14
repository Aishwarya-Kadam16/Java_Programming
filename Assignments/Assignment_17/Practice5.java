import java.util.Scanner;

class Logic
{
    public void printTable(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(iNo+ " * "+iCnt+ " = "+(iNo * iCnt));
        }
        
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

        
        Logic lobj = new Logic();
        lobj.printTable(iValue);

        lobj = null;
        sobj = null;
        System.gc();

    }
}
