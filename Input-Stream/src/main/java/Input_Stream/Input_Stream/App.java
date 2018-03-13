package Input_Stream.Input_Stream;

/**
 * Hello world!
 *
 */


import java.io.*;

public class App 
{
    public static void main( String[] args )
    {
        try {
			FileInputStream inputStream =  new FileInputStream("example.txt");
		    int data = inputStream.read();
		    while(data !=-1)
		    {
		    	System.out.print((char)data);
		    	
		    	data = inputStream.read();
		    }
		    inputStream.close();
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
