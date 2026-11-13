import java.util.Scanner;

class Marvellous
{
    public void printNumbers(int iLimit)
    {
        int iCnt = 0;

        System.out.println("");
        for(iCnt = 1;iCnt <= iLimit; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
}   //Time Complexity = O(N)
class Practice1
{
    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();

        mobj.printNumbers(iValue);

        mobj = null;
        sobj = null;
        System.gc();
    }
}