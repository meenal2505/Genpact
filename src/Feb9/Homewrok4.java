package Feb9;
abstract class AA
{
    AA() 
    {
        System.out.println("this is a constructor of abstract class");
    }
    abstract void aMethod();
    void nonAbstract() 
    {
        System.out.println("This is a normal method of abstract class");
    }
}
class BB extends AA 
{
    @Override
    void aMethod() 
    {
        System.out.println("This is abstract method");
    }
}
public class Homewrok4 
{
    public static void main(String[] args) 
    {
        BB b = new BB();
        b.aMethod();
        b.nonAbstract();
    }
}