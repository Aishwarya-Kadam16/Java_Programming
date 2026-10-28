import java.util.*;

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

class program100
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize = 0;
        System.out.println("Enter the number of elements you want : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];         //Dynamic memory allocation

        
        System.out.println("Enter the elements : ");

        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    

        System.out.println("Number of elements : "+Arr.length);

        ArrayX aobj = new ArrayX();
        aobj.display(Arr);

        //important
        aobj = null;
        Arr = null;
        sobj = null;
        System.gc();
    }
}