class Logic
{
    void findLargestDigit(int num)
    {
        int iDigit = 0;

        int iMax = 0;

        while(num!=0)
        {
            iDigit = num%10;

            num=num/10;

            //System.out.println(iDigit);

            if(iDigit>=iMax)
            {
                iMax = iDigit;
            }
        }

        
        System.out.println(iMax);
        
    }
}

class program20_4
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}