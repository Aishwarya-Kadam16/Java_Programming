class Logic
{
    void findFactorial(int num)
    {
        int iNo = 0;

        for(iNo = num;iNo>=1;iNo--)
        {
            System.out.println(iNo);  
        }
        
    }
}

class program16_3
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}