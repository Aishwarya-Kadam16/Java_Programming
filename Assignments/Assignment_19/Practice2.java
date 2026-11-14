import java.util.Scanner;

class Logic
{
    public void displayGrade(int iMarks)
    {
        if(iMarks >= 95 && iMarks<=100)
        {
            System.out.println("Grade is O");
        }

        else if(iMarks >= 90 && iMarks<=94)
        {
            System.out.println("Grade is A+");
        }

        else if(iMarks >= 80 && iMarks<=89)
        {
            System.out.println("Grade is A");
        }

        else if(iMarks >= 70 && iMarks<=79)
        {
            System.out.println("Grade is B+");
        }

        else if(iMarks >= 60 && iMarks<=69)
        {
            System.out.println("Grade is B");
        }

        else if(iMarks >= 50 && iMarks<=59)
        {
            System.out.println("Grade is C+");
        }

        else if(iMarks >= 35 && iMarks<=49)
        {
            System.out.println("Grade is C");
        }

        else if(iMarks < 35)
        {
            System.out.println("You are fail");
        }
    }
}
class Practice2 
{
    public static void main(String[] args) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Marks : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.displayGrade(iValue);

        
        lobj = null;
        sobj = null;
        System.gc();
    }
}
