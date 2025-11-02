class Logic
{
    void checkPalindrome(int num)
    {
        int iDigit = 0;
        int rev = 0;
        int original = num;

        while(num != 0)
        {
            iDigit = num%10;
            
            iDigit = num%10;
        
            System.out.println(iDigit);
            
            rev = rev * 10 + iDigit;

            num=num/10;
        }

        System.out.println(+rev);
        
        if(rev == original)
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }
    }
}

class program17_2
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}