package Feb9;
abstract class Bank 
{
    abstract int getBalance();
}
class BankA extends Bank 
{
    private int balance;
    void deposit(int money) 
    {
        balance += money;
    }
    @Override
    int getBalance() 
    {
        return balance;
    }
}
class BankB extends Bank 
{
    private int balance;
    void deposit(int money) 
    {
        balance += money;
    }
    @Override
    int getBalance() 
    {
        return balance;
    }
}
class BankC extends Bank 
{
    private int balance;
    void deposit(int money) 
    {
        balance += money;
    }
    @Override
    int getBalance() 
    {
        return balance;
    }
}
public class Homework2
{
    public static void main(String[] args) 
    {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        a. deposit(100);
        b. deposit(150);
        c. deposit(200);
        System.out.println("Balance of Bank A = ₹"+a.getBalance());
        System.out.println("Balance of Bank B = ₹"+b.getBalance());
        System.out.println("Balance of Bank C = ₹"+c.getBalance());
    }
}