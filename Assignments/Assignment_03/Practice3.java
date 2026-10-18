import java.util.Scanner;

class Marvellous
{
    public void evenFactors(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            return;
        }

        for(iCnt = 1;iCnt <= (iNo/2);iCnt++)
        {
            if((iNo % iCnt) ==0 && (iCnt%2)==0)
            {
                
                System.out.println(iCnt);
            }
        }
    }
}

class Practice3
{
    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Marvellous mobj = new Marvellous();
        mobj.evenFactors(iValue);

    }
}
