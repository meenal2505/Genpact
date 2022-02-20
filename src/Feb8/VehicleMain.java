//       Class Inheritance
//       vehicle     --->     Car     --->     Honda     --->     HondaCity     --->     Test
//       engine()             color()          hp()               speed()
//       sound()              model()          features()

package Feb8;

class Vehicle 
{
    int x;
    void sound() 
    {
        System.out.println("Sound function - Vehicle Class");
    }
    void engine() 
    {
        System.out.println("Engine function - Vehicle Class");
    }
}
class Car extends Vehicle 
{
    void colour() 
    {
        System.out.println("colour function - Car Class");
    }
    void model() 
    {
        System.out.println("model function - Car Class");
    }
}
class Honda extends Car 
{
    void hp() 
    {
        System.out.println("hp function - Honda Class");
    }
    void features() 
    {
        System.out.println("features function - Honda Class");
    }
}
class HondaCity extends Honda 
{
    void speed()
    {
        System.out.println("speed function - HondaCity Class");
    }
}
public class VehicleMain extends HondaCity 
{
    public static void main(String[] args) 
    {
        VehicleMain obj = new VehicleMain();
        obj.engine();   //vehicle class
        obj.sound();   //vehicle class
        obj.colour();   //Car class
        obj.model();   //Car class
        obj.hp();   //Honda class
        obj.features(); //Honda class
        obj.speed();  // Honda City
    }
    int sum(Object x)
    {
    	return 1;
    }
    int sum(int x)
    {
        return 2;
    }
}