/*create a class named 'Member' having the following members :
 * Data members
 * 1 - Name
 * 2 - Age
 * 3 - Phone number
 * 4 - Address
 * 5 - Salary
 * It also has a method named 'printSalary' which prints the salary of the members.
 * Two classes 'Employee' and 'Manager' inherits the 'Method' class.
 * The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
 * Now, assign name, age, phone number, address and salary to an employee and a  manager by making 
 * an object of both of these classes and print the same.
 */

package Feb8;
class Members
{
	String Name, Address;
	int age;
	long phone_no, salary;
	void printSalary()
	{
		System.out.println("Salary -> "+salary);
	}
	void printValues()
	{
		System.out.println("Name : "+Name);
		System.out.println("Phone number : "+phone_no);
		System.out.println("Address : "+Address);
		System.out.println("Age : "+age);
		printSalary();
	}
}
class employee extends Members
{
	String Specialization;
}
class Manager extends Members
{
	String Department;
}
public class Homework2 
{
	public static void main(String[] args) 
	{
		employee e = new employee();
		e.Name = "Meenal";
		e.age = 24;
		e.phone_no = 809268858l;
		e.Address = "Ranchi";
		e.salary = 20000l;
		e.printValues();
		System.out.print("\n");
		Manager m = new Manager();
		m.Name = "Dipankar";
		m.age = 25;
		m.phone_no = 8860090170l;
		m.Address = "Darbhanga";
		m.salary = 80000l;
		m.printValues();
	}
}
