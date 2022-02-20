/*program to print Dish using switch statement
 * 
 */

package Feb7;
import java.util.*;
public class Homework3 
{
	public static void main(String[] args) 
	{
		int ch, sum=0;
		String c;
		System.out.println("Menu:- \n\n");
		System.out.println("1. South Indian Dish\tRs. 150");
		System.out.println("2. North Indian Dish\tRs. 100");
		System.out.println("3. Rajasthani Dish\tRs. 130");
		System.out.println("4. Gujarati Dish\tRs. 180");
		System.out.println("5. Bengali Dish\tRs. 160");
		System.out.println("6. Dessert\tRs. 200");
		System.out.println("Press any other key to exit");
		System.out.println("\nPlease enter your choice :- ");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		do
		{
			switch(ch)
			{
			case 1:
				System.out.println("You have selected South Indian Dish of\tRs. 150");
				sum = sum + 150;
				break;
			case 2:
				System.out.println("You have selected North Indian Dish of\tRs. 100");
				sum = sum + 100;
				break;
			case 3:
				System.out.println("You have selected Rajasthani Dish of\tRs. 130");
				sum = sum + 130;
				break;
			case 4:
				System.out.println("You have selected Gujarati Dish of\tRs. 180");
				sum = sum + 180;
				break;
			case 5:
				System.out.println("You have selected Bengali Dish of\tRs. 160");
				sum = sum + 160;
				break;
			case 6:
				System.out.println("You have selected Dessert Dish of\tRs. 200");
				sum = sum + 200;
				break;
			default:
				System.out.println("Exit");
				sum = sum + 0;
				break;
			}
			System.out.println("Do you want to continue??");
			System.out.println("Press Y/y for yes abd any other key for no\n\n");
			c=sc.next();
		}
		while(c=="y"||c=="Y");
		System.out.println("Thank you");
		System.out.println("Your total sum = "+sum);
	}
}
