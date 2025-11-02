class Logic
{
    void sumEvenOddDigits(int num)
    {
        int iDigit = 0;
        int iSum = 0;
        int iSum1 = 0;
        int temp = num;
        
        while(num!=0)
        {
            iDigit = num%10;

            if((iDigit%2)==0)
            {
                iSum =iSum + iDigit; 
            }
            num = num/10;
            
        }
        System.out.println("The Sum of even number is: " +iSum);
        
        while(temp!=0)
        {
            iDigit = temp%10;

            if((iDigit%2)!=0)
            {
                iSum1 =iSum1 + iDigit; 
            }
            temp = temp/10;
        }
        System.out.println("The Sum of odd number is: " +iSum1);
    }
}

class program18_4
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}