class Logic
{
    void checkPerfect(int n)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt<=(n/2);iCnt++)
        {
            if((n%iCnt)==0)
            {
                //System.out.println(iCnt);
                iSum = iSum + iCnt;
            }
        }
       
        if(iSum == n)
        {
            System.out.println("The number is perfect");  
        }
        else
        {
            System.out.println("The number is not perfect");
        }
        
    }
}

class program20_3
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(28);
    }
}