import java.util.Scanner;

class Logic
{
    public void displayFacors(int iNo)
    {
        int iCnt = 0;

        System.out.println("The factors of "+iNo +" is : ");
        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
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

        Logic lobj = new Logic();
        lobj.displayFacors(iValue);

        lobj = null;
        sobj = null;
        System.gc();
    }
}
