/*Program to print pattern 
 *      *
 *      **
 *      ***
 *      ****
 *      *****
 *      ****
 *      ***
 *      **
 *      *
 */

package Feb7;

public class Homework2
{
	public static void main(String[] args) 
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;++j)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=4;i>=1;i--)
		{
			for(j=1;j<=i;++j)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
