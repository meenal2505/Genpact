
package Feb8;
class ChromeBook extends Laptop
{
    void noOfKeys()
    {
        System.out.println("ChromeBook class NoOfKeys()");
    }
}
class Digital 
{
    void power()
    {
        System.out.println("Digital class Power()");
    }
    void Memory()
    {
        System.out.println("Digital class Memory()");
    }
}
class Ipad extends Digital
{
    void color()
    {
        System.out.println("Ipad class color()");
    }
    void model()
    {
        System.out.println("Ipad class Model()");
    }
}
class Laptop extends Digital
{
    void screenSize()
    {
        System.out.println("Laptop class screenSize()");
    }
    void displayQuality(){
        System.out.println("Laptop class DispQuality()");
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        ChromeBook chromeBook=new ChromeBook(); //extends laptop ->extends Digital
        Ipad ipad=new Ipad(); // extends Digital
        chromeBook.power(); //digital class
        chromeBook.noOfKeys(); //chromebook
        chromeBook.displayQuality(); //laptop class method
        chromeBook.Memory(); //Digital class method
        chromeBook.screenSize(); //laptop class method
        ipad.color();//ipad class
        ipad.power();//digital class
        ipad.Memory();//Digital class
        ipad.model();//ipad class

    }
}