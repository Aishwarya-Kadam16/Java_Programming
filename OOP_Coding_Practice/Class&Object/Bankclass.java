class BankAccount
{
    public String accountHolderName;
    public String accountNumber;
    public int balance;

    public void displayAccountDetails()
    {
        System.out.println("The Account Holder Name is : "+accountHolderName);
        System.out.println("The Account Number is : "+accountNumber);
        System.out.println("The balance is : "+balance);
    }

}

public class Bankclass 
{
    public static void main(String[] args) 
    {
        BankAccount bobj1 = new BankAccount();
        BankAccount bobj2 = new BankAccount();

        bobj1.accountHolderName = "Aish";
        bobj1.accountNumber = "1234567890";
        bobj1.balance = 10000;

        bobj2.accountHolderName = "Aishwarya";
        bobj2.accountNumber = "2345678560";
        bobj2.balance = 20000;

        bobj1.displayAccountDetails();
        bobj2.displayAccountDetails();

        bobj1.balance = 30000;
        bobj1.displayAccountDetails();
        bobj2.displayAccountDetails();
    }
}
