import java.util.*;
//Reverse loop

class Number 
{
    public boolean checkPerfect(int iNo)
    {

        int iCnt = 0,iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
                                    //Change
        for(iCnt = (iNo/2);(iCnt >= 1 && (iSum < iNo)) ;iCnt--)
        {
            if((iNo % iCnt)==0)
            {
                iSum = iSum + iCnt;
                
            }
        }

                //[Expression]
        return (iNo == iSum);
        
    }
}   
class program85
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        bRet = nobj.checkPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue +" is a perfect number");
        }

        else
        {
            System.out.println(iValue +" is not a perfect number");
        }

        nobj = null;
        sobj = null;

        System.gc();
    }
}
