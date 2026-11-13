import java.util.Scanner;

class Marvellous
{
    public int iNo1;
    public int iNo2;

    public Marvellous(int iNo1, int iNo2)
    {
        this.iNo1 = iNo1;
        this.iNo2 = iNo2;
    }

    public void rangeDisplayRev()
    {
        int iCnt = 0;

        System.out.println("The elements in the range in reverse order "+this.iNo1 +" to "+this.iNo2);

        for(iCnt = this.iNo2; iCnt >= this.iNo1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }

}   //Time Complexity : O(N)
class Practice5
{
    public static void main(String[] args) 
    {
        int iValue1 =0, iValue2 = 0;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter starting point : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter ending point : ");
        iValue2 = sobj.nextInt();

        Marvellous mobj = new Marvellous(iValue1, iValue2);
        mobj.rangeDisplayRev();

        mobj = null;
        sobj = null;
        System.gc();
    }
}
