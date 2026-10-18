
import java.io.*;

class Number
{
    public void displayFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt=1;iCnt<=(iNo/2);iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                System.out.println(iCnt);
            }
        }
    }

}   //Time Complexity = O(N/2)

class program78
{
    public static void main(String[] args) throws IOException
    {
        int iValue = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");

        iValue = Integer.parseInt(bobj.readLine()); 
        
        Number nobj = new Number();
        nobj.displayFactors(iValue);

        nobj = null;
        bobj = null;

        System.gc();
        
    }
}
