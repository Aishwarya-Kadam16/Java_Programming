class Logic
{
    void displayGrade(int marks)
    {
        if(marks>=90)
        {
            System.out.println("The grade is 'O' ");
        }

        if(marks>=80)
        {
            System.out.println("The grade is 'A+' ");
        }
        if(marks>=70)
        {
            System.out.println("The grade is 'A' ");
        }
        if(marks>=60)
        {
            System.out.println("The grade is 'B+' ");
        }
        if(marks>=50)
        {
            System.out.println("The grade is 'B' ");
        }
        if(marks>=35)
        {
            System.out.println("The grade is 'C' ");
        }
        else
        {
            System.out.println(" Fail ");
        }
        
    }
}

class program19_2
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.displayGrade(80);
    }
}