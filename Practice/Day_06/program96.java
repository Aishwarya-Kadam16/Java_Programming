class program96
{
    public static void main(String Args[])
    {

        int Arr[] = new int[4];         //Dynamic memory allocation

        //Member by member initialization list
        Arr[0] = 10;
        Arr[1] = 20;
        Arr[2] = 30;
        Arr[3] = 40;

        System.out.println("Number of elements : "+Arr.length);

        //Sequence
        System.out.println(Arr[0]);
        System.out.println(Arr[1]);
        System.out.println(Arr[2]);
        System.out.println(Arr[3]);
    }
}