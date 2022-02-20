/*program to print pattern
 * 12
 * 13
 * 21
 * 21
 * 32
 * 33
 */

package Feb7;

public class Homework6 
{ 
	public static void main(String args[]) 
	{
        for (int i = 1; i <= 3; i++)
        {
            for (int j = 2; j <= 3; j++) 
            {
                if (i % 2 != 0) 
                {
                    System.out.println(i+""+j);
                }
                else
                {
                    System.out.println(i+""+1);
                }
            }

        }
    }
}