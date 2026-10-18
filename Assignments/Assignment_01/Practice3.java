
class Marvellous
{
    public void display()
    {
        int iCnt = 0;

        iCnt = 5;
        while(iCnt>=1)
        {
            System.out.println(iCnt);
            iCnt--;
        }
    }
}
class Practice3
{
    public static void main(String[] args) 
    {

        Marvellous mobj = new Marvellous();
        mobj.display();

        mobj = null;
        System.gc();

    }
}