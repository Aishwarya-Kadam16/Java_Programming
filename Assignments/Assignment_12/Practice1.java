import java.util.Scanner;

class Marvellous
{
    public void printFactors(int iNo)
    {
        int iCnt = 0;

        System.out.println("The factors of "+iNo+" are : ");
        for(iCnt = 1;iCnt<=(iNo / 2);iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}   //Time Complexity : O(N/2)
class Practice1 
{
    public static void main(String[] args) 
    {
        int iValue = 0;


        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        mobj.printFactors(iValue);

        mobj = null;
        sobj = null;
        System.gc();
    }
}
