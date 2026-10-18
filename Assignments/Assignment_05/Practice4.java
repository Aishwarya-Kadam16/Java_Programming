import java.util.Scanner;

class Marvellous
{
    public void checkNumberType(int iNo)
    {
        if(iNo > 0)
        {
            System.out.println(iNo+" is positive");
        }

        else if(iNo < 0)
        {
            System.out.println(iNo+" is negative");
        }

        else if(iNo == 0)
        {
            System.out.println("Number is zero");
        }

    }
}

class Practice4
{
    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();


        Marvellous mobj = new Marvellous();
        mobj.checkNumberType(iValue);

        
    }
}
