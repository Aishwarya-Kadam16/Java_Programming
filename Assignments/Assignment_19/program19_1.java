class Logic
{
    void checkLeapYear(int num)
    {
        if((num%4)==0 && (num%100)!=0 || (num%400)==0)
        {
            System.out.println("The Year is leap year");
        }
        else
        {
            System.out.println("The number is not leap year");
        }
    }  
}

class program19_1
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2023);
    }
}