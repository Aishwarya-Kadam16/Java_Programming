
class Marvellous
{
    public void display()
    {
        int iCnt = 0;

        for(iCnt = 1;iCnt<=5;iCnt++)
        {
            System.out.println("Marvellous");
        }
    }
}
class Practice2
{
    public static void main(String[] args) 
    {

        Marvellous mobj = new Marvellous();
        mobj.display();

        mobj = null;
        System.gc();

    }
}