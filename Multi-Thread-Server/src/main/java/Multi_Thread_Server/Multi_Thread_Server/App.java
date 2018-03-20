package Multi_Thread_Server.Multi_Thread_Server;

/**
 * Hello world!
 *
 */

import java.net.*;
import java.io.*;
public class App 
{
    public static void main( String[] args )
    {
    	try
        {
            ServerSocket serverSocket = new ServerSocket(9090);
            boolean stop = false;
            while(!stop)
            {
                System.out.println("Waiting for clients...");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client is connected.");
                ClientThread clientThread = new ClientThread(clientSocket);
                clientThread.start();
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }    }
}
