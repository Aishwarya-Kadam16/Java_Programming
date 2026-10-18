import java.util.Scanner;

class Marvellous
{
    public void factRev(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo;iCnt>=1;iCnt--)
        {
            System.out.print(iCnt+ "\t");
        }
        System.out.println("");

    }
}
class Practice2
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        mobj.factRev(iValue);
    
    }
}
