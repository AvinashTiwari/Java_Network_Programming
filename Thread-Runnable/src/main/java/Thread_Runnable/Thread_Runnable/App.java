package Thread_Runnable.Thread_Runnable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ImplementRunable runnable = new ImplementRunable(1);
    	Thread thread = new Thread(runnable);
    	thread.start();
    	ImplementRunable runnabl2 = new ImplementRunable(2);
    	Thread thread2 = new Thread(runnable);
    	thread2.start();
    	System.out.println(thread2.getName());
    	System.out.println(thread.getName());
    	ImplementRunable runnabl3 = new ImplementRunable(3);
    	runnabl3.start();
  
    }
}
