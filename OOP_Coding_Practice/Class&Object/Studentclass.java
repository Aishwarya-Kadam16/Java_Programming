class Student
{
    public String name;
    public int age;

    public void displayDetails()
    {
        System.out.println("The name of the student is : "+name);
        System.out.println("The age of the student is : "+age);
    }

}

public class Studentclass
{
    public static void main(String A[])
    {
        Student sobj1 = new Student();

        sobj1.name = "Aish";
        sobj1.age = 22;

        sobj1.displayDetails();
    }
}