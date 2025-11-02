class Logic
{
    void CheckEvenOdd(int num)
    {
        if((num%2)==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
}

class program16_2
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.CheckEvenOdd(7);
    }
}