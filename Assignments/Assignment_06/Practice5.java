import java.util.Scanner;

class Marvellous
{
    public float calPercentage(int iNo1, int iNo2)
    {
        float fAns = 0.0f;

        fAns = ((float)iNo1/(float)iNo2) * 100;

        return fAns;
    }
}
class Practice5
{
    public static void main(String[] args) 
    {
        int iValue1 = 0, iValue2 = 0;
        float fRet = 0.0f;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Obtained marks : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Total marks : ");
        iValue2 = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        fRet = mobj.calPercentage(iValue1, iValue2);
        
        System.out.println("Total percentage : "+fRet+ "%");

        mobj = null;
        sobj = null;

        System.gc();
    }
}
