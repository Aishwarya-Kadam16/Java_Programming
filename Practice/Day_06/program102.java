import java.util.Scanner;

class ArrayX
{
    
    public void display(int Brr[])
    {
        int iCnt = 0;
        System.out.println("Elements of the array are : ");

        for(iCnt = 0;iCnt<Brr.length;iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }

    public int countEven(int Brr[])
    {
        int iCount = 0;

        int iCnt = 0;
        for(iCnt = 0;iCnt<Brr.length;iCnt++)
        {
            if((Brr[iCnt] % 2)==0)
            {
                iCount++;
            }
        }

        return iCount;
    }

    public int summetion(int Brr[])
    {
        int iSum = 0;

        int iCnt = 0;
        for(iCnt = 0;iCnt<Brr.length;iCnt++)
        {
            iSum = iSum + Brr[iCnt];
        }

        return iSum;
    }
}       



class program102
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize = 0,iRet = 0,iRet1 =0;

        System.out.println("Enter the number of elements you want : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the elements : ");

        int[] Arr = new int[iSize];

        int iCnt = 0;
        for(iCnt = 0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        
        ArrayX aobj = new ArrayX();
        aobj.display(Arr);
        iRet = aobj.countEven(Arr);
        iRet1 = aobj.summetion(Arr);

        System.out.println("The even elements are : "+iRet);
        System.out.println("The sum of all the elements are : "+iRet1);

        //Important
        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();

    }
}
