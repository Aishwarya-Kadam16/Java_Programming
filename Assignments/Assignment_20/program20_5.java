class Logic
{
    void findSmallestDigit(int num)
    {
        int iDigit = 0;

        int iMax = 9;

        while(num!=0)
        {
            iDigit = num%10;

            num=num/10;

            //System.out.println(iDigit);

            if(iDigit<iMax)
            {
                iMax = iDigit;
            }
        }

        
        System.out.println(iMax);
        
    }
}

class program20_5
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}