class Logic
{
    void calculateSum(int n)
    {
        int iN = 0;

        int iSum = 0;

        for(iN=1;iN<=n;iN++)
        {
            //System.out.println(+iN);

            iSum = iSum + iN;
        }
        System.out.println(iSum);

    }
}

class program16_1
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    } 
}