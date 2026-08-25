class Book
{
    public String title;
    public String author;
    public int price;

    public void displayBook()
    {
        System.out.println("The Title of the book is : "+title);
        System.out.println("The Author  of the book is : "+author);
        System.out.println("The Price  of the book is : "+price);
    }
}

public class Bookclass 
{
    public static void main(String[] args) 
    {
        Book bobj1 = new Book();

        bobj1.title = "Atomic Habits";
        bobj1.author = "James Clear";
        bobj1.price = 500;

        bobj1.displayBook();

        Book bobj2 = new Book();

        bobj2.title = "Harry Potter";
        bobj2.author = "J. K. Rowling";
        bobj2.price = 800;

        bobj2.displayBook();
    }
}
