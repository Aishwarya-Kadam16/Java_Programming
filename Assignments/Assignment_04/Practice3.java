import java.util.Scanner;

class Marvellous
{
    public void displayNonFact(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1;iCnt<iNo;iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                System.out.println(iCnt);
            }
        }
        System.out.println("");

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
        mobj.displayNonFact(iValue);
    
    }
}
