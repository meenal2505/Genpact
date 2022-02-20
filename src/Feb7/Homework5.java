//Program to print initial letter of your name
package Feb7;
import java.util.*;
public class Homework5 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        printM();
    }
    static int height = 5;

    static int width = (2 * height) - 1;

    static int abs(int d)
    {
        return d < 0 ? -1 * d : d;
    }
    static void printM()
    {
        int i, j, counter = 0;
        for (i = 0; i < height; i++)
        {
            System.out.printf("*");
            for (j = 0; j <= height; j++)
            {
                if (j == height)
                    System.out.printf("*");
                else if (j == counter || j == height - counter - 1)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
            if (counter == height / 2)
            {
                counter = -99999;
            }
            else
                counter++;
            System.out.printf("\n");
        }
    }
}

