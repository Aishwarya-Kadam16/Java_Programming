
import java.io.*;

class program76
{
    public static void main(String[] args) throws IOException
    {
        int iNo = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");

        iNo = Integer.parseInt(bobj.readLine()); 
        

        int iCnt = 0;

        for(iCnt=1;iCnt<=(iNo/2);iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
