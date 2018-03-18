package Local_Port_Scanner.Local_Port_Scanner;

import java.io.*;
import java.net.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	   int port = 1;
           while(port <= 65535)
           {
               try
               {
                   ServerSocket server = new ServerSocket(port);
               }
               catch(IOException e)
               {
                   System.out.println("Port " + port + " is open!");
               }
               port++;
           }    }
}
