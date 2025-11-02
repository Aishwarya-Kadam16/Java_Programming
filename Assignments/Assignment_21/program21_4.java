class Logic
{
    void displayFactors(int num)
    {
        int iCnt = 0;

        int iCount = 0;

        for(iCnt=1;iCnt<=num;iCnt++)
        {
            if((num%iCnt)==0)
            {
                //System.out.println(iCnt);

                iCount++;
            }
        }
        System.out.println(iCount);
    }
}

class program21_4
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}