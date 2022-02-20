//program to find leap year

package Feb7;
import java.util.*;
public class Homework1 
{
	public static void main(String[] args)
	{
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		year = sc.nextInt();
		if((year%400==0)||((year%4==0)&&(year%100!=0)))
		{
			System.out.println("Is a leap year "+year);
		}
	    else 
	    {
            System.out.println("Is not a leap year " + year);
        }
	}
}
