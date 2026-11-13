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

    public int rangeSum()
    {
        int iCnt = 0,iSum = 0;

        if(this.iNo1 < 0 || this.iNo2 <0)
        {
            System.out.println("Invalid range");
            return -1;
        }

        if(this.iNo1 > this.iNo2)
        {
            System.out.println("Invalid range");
            return -1;
        }

        for(iCnt = this.iNo1; iCnt <= this.iNo2; iCnt++)
        {
            iSum = iSum + iCnt;
            
        }

        return iSum;
    }

}   //Time Complexity : O(N)
class Practice3
{
    public static void main(String[] args) 
    {
        int iValue1 =0, iValue2 = 0,iRet;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter starting point : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter ending point : ");
        iValue2 = sobj.nextInt();

        Marvellous mobj = new Marvellous(iValue1, iValue2);
        iRet = mobj.rangeSum();

        System.out.println("The sum of elements in the range "+iValue1 +" to "+iValue2 +" are "+iRet);

        mobj = null;
        sobj = null;
        System.gc();
    }
}
