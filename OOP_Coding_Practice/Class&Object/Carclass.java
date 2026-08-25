class Car
{
    public String brand;
    public int price;

    public void displayCar()
    {
        System.out.println("The brand  of the car is : "+brand);
        System.out.println("The price of the car is : "+price);
    }
}

public class Carclass 
{
    public static void main(String[] args) 
    {
        Car cobj1 = new Car();
        Car cobj2 = cobj1;

        cobj2.brand = "BMWx5";
        cobj2.price = 100000;

        cobj1.displayCar();
    }
}
