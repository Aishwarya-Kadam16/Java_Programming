import java.util.Scanner;

class Marvellous
{
    public char displayConvert(char cValue)
    {
        char Value = '\u0000';
        int num = 32;

        if(cValue >= 67 || cValue <=90)
        {
            Value = (char)(cValue + num);
            
        }

        if(cValue >= 97 || cValue <=122)
        {
            Value = (char)(cValue - num);
            
        }

        return Value;
    }
}

class Practice4
{
    public static void main(String[] args) 
    {
        char cValue = '\u0000';
        char cRet = '\u0000';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Character : ");
        cValue = sobj.next().charAt(0);
        Marvellous mobj = new Marvellous();
        cRet = mobj.displayConvert(cValue);

        System.out.println(cValue +" become "+cRet);

        
    }
}
