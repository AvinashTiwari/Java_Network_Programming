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
        thread.start();
    }
}
