import java.util.Scanner;

class program73 
{
    public static void main(String[] args) 
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        int iCnt = 0;

        for(iCnt = 1; iCnt<=(iNo/2);iCnt++)
        {
            if((iNo % iCnt)==0)
            {
                System.out.println(iCnt);
            }
        }
    }    
}
