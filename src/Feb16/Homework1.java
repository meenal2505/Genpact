package Feb16;
class Myclass extends Thread 
{
    String threadName;
    public Myclass(String threadName) 
    {
        this.threadName = threadName;
    }
    public void run() 
    {
        try 
        {
            for (int i = 0; i < 5; i++) 
            {
                System.out.println(threadName+" Thread executing "+i);
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
public class Homework1 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Myclass thread1 = new Myclass("Thread 1");
        Myclass thread2 = new Myclass("Thread 2");
        thread1.start();
        thread2.start();
    }
}
