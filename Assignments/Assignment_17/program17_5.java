class Logic
{
    void printTable(int num)
    {
        int iCnt = 0;

        for(iCnt = num; iCnt<=num*10;iCnt++)
        {
            if((iCnt%5)==0)
            {
                System.out.println(iCnt);
            } 
        }
    }
}

class program17_5
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}