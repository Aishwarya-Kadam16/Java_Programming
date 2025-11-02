class Logic
{
    void printDigits(int num)
    {
        int iDigit = 0;

        int iDigit1 = 0;

        int temp = num;

        int rev = 0;

        while(num!=0)
        {
            iDigit = num%10;

            num = num/10;

            rev = rev * 10 + iDigit;

            //System.out.println(rev);
        }

        while(rev != 0)
        {
            iDigit1 = rev % 10;

            rev = rev/10;

            System.out.println(iDigit1);
        }
    }
}

class program19_4
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}