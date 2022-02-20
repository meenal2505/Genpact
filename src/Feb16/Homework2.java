package Feb16;
class My extends Thread 
{
    public void run() 
    {
        try 
        {
            for (int i = 0; i < 5; i++) 
            {
                System.out.println("Child Thread executing");
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println("InterruptedException occur and handled by catch");
        }
    }
}
public class Homework2 
{
    public static void main(String[] args) throws InterruptedException 
    {
        My thread = new My();
        thread.start();
        thread.interrupt();
        System.out.println("Main thread execution completes");
    }
}