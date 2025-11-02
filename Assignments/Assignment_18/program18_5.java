class Logic
{
    void checkSign(int num)
    {
        if(num>0)
        {
            System.out.println("The number is positive");
        }
        else if(num<0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is zero");
        }
    }
}

class program18_5
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}