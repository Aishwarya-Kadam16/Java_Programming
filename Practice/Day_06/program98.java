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

class program98
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize = 0;
        System.out.println("Enter the number of elements you want : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];         //Dynamic memory allocation

        //Member by member initialization list
        System.out.println("Enter the elements : ");

        Arr[0] = sobj.nextInt();
        Arr[1] = sobj.nextInt();
        Arr[2] = sobj.nextInt();
        Arr[3] = sobj.nextInt();
        Arr[4] = sobj.nextInt();

        System.out.println("Number of elements : "+Arr.length);

        ArrayX aobj = new ArrayX();
        aobj.display(Arr);

        
    }
}