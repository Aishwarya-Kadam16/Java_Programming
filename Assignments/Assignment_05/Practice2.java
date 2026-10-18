import java.util.Scanner;

class Marvellous
{
    public int findMax(int iNo1,int iNo2)
    {
        if(iNo1 > iNo2)
        {
            return iNo1;
        }

        else
        {
            return iNo2;
        }
    }
}

class Practice2
{
    public static void main(String[] args) 
    {
        int iValue1 = 0, iValue2 = 0;
        int iRet = 0;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        iRet = mobj.findMax(iValue1,iValue2);

        System.out.println(iRet + " is Maximum Number");
    }
}
