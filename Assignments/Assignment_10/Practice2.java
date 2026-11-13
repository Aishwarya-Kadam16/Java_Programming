import java.util.Scanner;

class Marvellous
{
    public float fWidth;
    public float fHeight;

    public Marvellous(float fWidth , float fHeight)
    {
        this.fWidth = fWidth;
        this.fHeight = fHeight;
    }

    public double rectArea()
    {
        double dArea = 0.0;

        dArea = fWidth * fHeight;

        return dArea;
    }
}
class Practice2 
{
    public static void main(String[] args) 
    {
        float fValue1 = 0.0f, fValue2 = 0.0f;
        double dRet = 0.0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle : ");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter the height of the rectangle : ");
        fValue2 = sobj.nextFloat();

        Marvellous mobj = new Marvellous(fValue1, fValue2);
        dRet = mobj.rectArea();

        System.out.println("The Area of the Rectangle is : "+dRet);

        mobj = null;
        sobj = null;
        System.gc();
    }
}
