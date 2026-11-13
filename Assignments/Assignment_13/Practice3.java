import java.util.Scanner;

class Marvellous
{
    public void printOddNumbers(int iLimit)
    {
        int iCnt = 0;

        System.out.println("The odd numbers upto "+iLimit+ " are : ");
        for(iCnt = 1;iCnt <= iLimit; iCnt++)
        {
            if((iCnt % 2) != 0)
            {
                System.out.println(iCnt);
            }  
        }
    }
}   //Time Complexity = O(N)
class Practice3
{
    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();

        mobj.printOddNumbers(iValue);

        mobj = null;
        sobj = null;
        System.gc();
    }
}