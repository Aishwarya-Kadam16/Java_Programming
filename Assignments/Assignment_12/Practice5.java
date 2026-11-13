import java.util.Scanner;

class Marvellous
{
    public boolean divisibleBy5(int iNo)
    {
        boolean bFlag = false;

        if((iNo % 5) == 0)
        {
            bFlag = true;
        }

        return bFlag;
    }
}   
class Practice5
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        boolean bRet = false;


        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        bRet = mobj.divisibleBy5(iValue);

        if(bRet == true)
        {
            System.out.println("The "+iValue +" is divisible by 5");
        }

        else
        {
            System.out.println("The "+iValue +" is not divisible by 5");
        }
        
        mobj = null;
        sobj = null;
        System.gc();
    }
}
