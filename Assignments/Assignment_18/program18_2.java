class Logic
{
    void EvenNumbers(int num)
    {
        int iCnt = 0;

        for(iCnt=1;iCnt<=num;iCnt++)
        {
            if((iCnt%2)==0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program18_2
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.EvenNumbers(20);
    }
}