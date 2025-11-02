class Logic
{
    void calculatePower(int base , int exp)
    {
        int iCnt = 0;

        int power = 2;

        for(iCnt = 1; iCnt < exp; iCnt++)
        {
            power = power * base ;
        }
        System.out.println(power);
    }
}

class program19_5
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2,5);
    }
}