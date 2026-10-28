//OOP design
import java.util.Scanner;

class ArrayX
{
    //Characteristics
    private int Arr[];           //allocate memory to the reference
    private int iSize;

    //Constructor
    public ArrayX(int iNo)
    {
        System.out.println("Inside constructor");
        this.iSize = iNo;
        this.Arr = new int[this.iSize];      //constructor is used to allocate the resource
    }

    //Setter method
    public void accept()
    {
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements of array : ");
        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    //Getter Method
    public void display()
    {
        int iCnt = 0;

        System.out.println("The elements of the array are : ");
        for(iCnt = 0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public float average()
    {
        int iCnt = 0,iSum = 0;
        float fAvg = 0.0f;
        for(iCnt = 0;iCnt<Arr.length;iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        fAvg = (iSum /this.iSize);
        return fAvg;
    }
}//End of ArrayX class

class program108
{
    public static void main(String[] args) 
    {
        float fRet = 0.0f;
        ArrayX aobj1 = new ArrayX(5);
        aobj1.accept();             //Behavioural mechanism
        aobj1.display();
        fRet = aobj1.average();
        System.out.println("The average is : "+fRet);

        aobj1 = null;
        System.gc();

       
    }
}
