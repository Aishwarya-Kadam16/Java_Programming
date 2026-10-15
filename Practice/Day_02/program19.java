//Display Jay Ganesh on the screen
class program19
{
    public void display()
    {
        //Sequence
        System.out.println("Jay Ganesh...");
        System.out.println("Jay Ganesh...");
        System.out.println("Jay Ganesh...");
        System.out.println("Jay Ganesh...");
    }
    public static void main(String[] Arg)
    {
        display();      //Error (because display is non static method)
        
        
    }

}

//drawback : from static method(main()) we call to non static method(display())
//non static function can access static and non static members
//static function can access only static