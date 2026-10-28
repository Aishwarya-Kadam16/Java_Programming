class ArrayX
{
    public void display(int Brr[])
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Brr.length;iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }
}

class program97
{
    public static void main(String Args[])
    {

        int Arr[] = new int[4];         //Dynamic memory allocation

        //Member by member initialization list
        Arr[0] = 10;
        Arr[1] = 20;
        Arr[2] = 30;
        Arr[3] = 40;

        System.out.println("Number of elements : "+Arr.length);

        ArrayX aobj = new ArrayX();
        aobj.display(Arr);

        
    }
}