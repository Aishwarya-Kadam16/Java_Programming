class program93
{
    public static void main(String Args[])
    {
        int Arr[] = {10,20,30,40};          //Static memory allocation

        System.out.println("Number of elements : "+Arr.length);

        //int iCnt = 0; (inline variable creation)
        for(int iCnt = 0;iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        
        
    }
}