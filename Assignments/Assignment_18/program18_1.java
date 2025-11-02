class Logic
{
    void checkPrime(int num)
    {
        int iCnt = 0;

        int iFrequency = 0;

        for(iCnt = 2 ; iCnt<=(num/2); iCnt++)
        {
            if((num%iCnt)==0)
            {
                iFrequency++;
                break;  //Optimization
            }
        }
        if(iFrequency == 0)
        {
            System.out.println("The number is prime");
        }
        else
        {
            System.out.println("The number is not prime number");
        }
    }
}

class program18_1
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}