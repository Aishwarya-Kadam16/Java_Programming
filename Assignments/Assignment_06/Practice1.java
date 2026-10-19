import java.util.Scanner;

class Practice1
{
    public static void main(String Args[])
    {
        String sName = null;

        Scanner sobj= new Scanner(System.in);
        System.out.println("Enter the name : ");

        sName = sobj.nextLine();

        System.out.println("Your Name is : "+sName);

        sobj =null;
        System.gc();
    }
}