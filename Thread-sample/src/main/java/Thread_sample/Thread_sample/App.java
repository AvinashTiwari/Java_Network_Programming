package Thread_sample.Thread_sample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ServerThread thread = new ServerThread("Server 1");
        ServerThread thread2 = new ServerThread("Server 2");
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        thread2.start();
    }
}
