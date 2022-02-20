//Program for ATM

package Feb7;
import java.util.*;
public class Homework4 
{
	public static void main(String[] args) 
	{
		int code = 1111, pin;
		System.out.println("Welcome to XYZ bank");
		System.out.println("Please Enter your ATM card");
		System.out.println("Please Enter your ATM Pin");
		Scanner sc = new Scanner(System.in);
		pin = sc.nextInt();
		if(pin == code)
		{
			System.out.println("Correct pin\n\n1. Balance check\n2. Change Pin\n3. Cash withdraw\n\nPlease enter your choice : ");
		}
		else
		{
			System.out.println("Incorrect pin");
		}
	}
}
