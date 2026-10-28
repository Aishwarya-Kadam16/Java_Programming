//OOP design

class ArrayX
{
    //Characteristics
    public int Arr[];           //allocate memory to the reference
    public int iSize;

    public ArrayX(int iNo)
    {
        this.iSize = iNo;
        this.Arr = new int[this.iSize];      //constructor is used to allocate the resource
    }
}

class program103 
{
    public static void main(String[] args) 
    {
        ArrayX aobj1 = new ArrayX(10);
        ArrayX aobj2 = new ArrayX(5);
        ArrayX aobj3 = new ArrayX(7);
        ArrayX aobj4 = new ArrayX(3);
    }
}
