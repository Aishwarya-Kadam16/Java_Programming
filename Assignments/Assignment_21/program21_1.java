class Logic
{
    void productOfDigits(int num)
    {
        int iDigit = 0;

        int iProduct = 1;

        while(num !=0 )
        {
            iDigit = num%10;

            num = num/10;

            //System.out.println(iDigit);

            iProduct = iProduct * iDigit;
        }
        System.out.println(iProduct);

    }
}

class program21_1
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}