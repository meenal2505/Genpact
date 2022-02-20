/*Create a class with a method that prints "This is parent class"
 * and its subclass with another method that prints "This is child class".
 * Now, create an object for each of the class and call
 * 1. method of parent class by object of parent class
 * 2. method of child class by object of child class
 * 3. method of parent class by object of child class
 */

package Feb8;

class ABC
{
	void display()
	{
		System.out.println("This is Parent class");
	}
}
public class Homework1 extends ABC
{
	void dis()
	{
		System.out.println("This is child class");
	}
	public static void main(String[] args) 
	{
		ABC abc = new ABC();
		Homework1 xyz = new Homework1();
		abc.display();//method of parent class by object of parent class
		xyz.dis();//method of child class by object of child class
		xyz.display();//method of parent class by object of child class
	}
}
