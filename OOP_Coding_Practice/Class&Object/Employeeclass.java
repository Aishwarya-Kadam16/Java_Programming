class Employee
{
    public String name;
    public int Salary;

    public void displayDetails()
    {
        System.out.println("The name of the Employee is : "+name);
        System.out.println("The Salary of the Employee is : "+Salary);
    }
}

public class Employeeclassobj2 
{
    public static void main(String[] args) 
    {
        Employee eobj1 = new Employee();

        Employee eobj2 = new Employee();

        eobj1.name = "Aish";
        eobj1.Salary = 25000;

        eobj2.name = "Aishwarya";
        eobj2.Salary = 30000;

        eobj1.displayDetails();
        eobj2.displayDetails();
    }
}
