package Feb9;
import java.util.Scanner;

interface N1 
{
    void display(int p);
}
class testClass implements N1 
{
    public void display(int k)
    {
        int count = 0, prime = 1;
        for (int i = 3; i <= k; i++) 
        {
            count = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) 
            {
                if (i % j == 0) 
                {
                    count++;
                }
            }
            if (count == 0)
                prime++;
        }
        System.out.println(prime);
    }
}

public class Homework5 
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int k= sc.nextInt();
            testClass p = new testClass();
            p.display(k);
        }
    }
}
