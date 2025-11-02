class Logic
{
    void countEvenOddRange(int num)
    {
        int iCnt = 0;

        int temp = num;

        int iCount = 0;
        int iCount1 = 0;

        for(iCnt=1;iCnt<=num;iCnt++)
        {
            if((iCnt%2)==0)
            {
                //System.out.println(iCnt);

                iCount++;
            }
            
        }
        System.out.println("Even number count : " +iCount);

        for(iCnt=1; iCnt<=temp;iCnt++)
        {
            if((iCnt%2)!=0)
            {
                //System.out.println(iCnt);

                iCount1++;
            }
           
        }
         System.out.println("Odd number count : " +iCount1);
    }
}

class program21_2
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}