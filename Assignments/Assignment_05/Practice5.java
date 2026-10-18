import java.util.Scanner;

class Marvellous
{
    public int findLarget(int iNo1,int iNo2 , int iNo3)
    {
        if(iNo1 > iNo2 && iNo1 > iNo3)
        {
            return iNo1;
        }

        else if(iNo2 > iNo1 && iNo2 > iNo3)
        {
            return iNo2;
        }

        else
        {
            return iNo3;
        }

    }
}

class Practice5
{
    public static void main(String[] args) 
    {
        int iValue1 = 0,iValue2 = 0, iValue3 = 0;
        int iRet = 0;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter third number : ");
        iValue3 = sobj.nextInt();


        Marvellous mobj = new Marvellous();
        iRet = mobj.findLarget(iValue1, iValue2, iValue3);

        System.out.println(iRet+ " is a largest number");
        
    }
}
