import java.util.Scanner;

class Marvellous
{
    public boolean displayVowels(char cValue)
    {
        if(cValue == 'a' || cValue == 'e' || cValue == 'i' || cValue == 'o' || cValue == 'u' || cValue == 'A' || cValue == 'E' || cValue == 'I' || cValue == 'O' || cValue == 'U')
        {
            return true;
        }

        else
        {
            return false;
        }
        
    }
}

class Practice5
{
    public static void main(String[] args) 
    {
        char cValue = '\u0000';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Character : ");
        cValue = sobj.next().charAt(0);
        Marvellous mobj = new Marvellous();
        bRet = mobj.displayVowels(cValue);

        if(bRet)
        {
            System.out.println(cValue + " is vowel");
        }

        else
        {
            System.out.println(cValue + " is not a vowel");
        }

        
    }
}
