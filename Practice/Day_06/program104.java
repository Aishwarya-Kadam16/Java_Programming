//OOP design
import java.util.Scanner;

class ArrayX
{
    //Characteristics
    public int Arr[];           //allocate memory to the reference
    public int iSize;

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
}

class program104
{
    public static void main(String[] args) 
    {
        ArrayX aobj1 = new ArrayX(5);
        ArrayX aobj2 = new ArrayX(7);
        
    }
}
