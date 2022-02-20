package Feb8;

class Sources extends proteins 
{
    public Sources()
    {
        System.out.println("Milk is a great source of protein");
    }
    public Sources(String source2)
    {
        this();
        System.out.println(source2 + " is also a great source of protein");
    }
    public Sources(String source2, String source3) 
    {
        this(source2);
        System.out.println(source3 + " is also a great source of protein");
        displayBenefits();
    }
}
class proteins 
{
	String benefit1 = "It helps in muscle building";
    String benefit2 = "It helps in mass gain";
    String benefit3 = "Provides strength";
    public proteins()
    {
        System.out.println("Proteins default constructor");
    }
    public void displayBenefits() 
    {
        System.out.println(benefit1);
        System.out.println(benefit2);
        System.out.println(benefit3);
    }
}
public class MyProtein 
{
	static Sources obj;
    public static void main(String[] args) 
    {
        obj = new Sources("Egg", "Nuts");
    }
}