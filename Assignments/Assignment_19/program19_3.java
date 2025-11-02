class Logic
{
    void checkDivisible(int num)
    {
        if((num%5)==0 && (num%11)==0)
        {
            System.out.println("true");
        }
        else
        {
             System.out.println("false");
        }
    }
}

class program19_3
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}