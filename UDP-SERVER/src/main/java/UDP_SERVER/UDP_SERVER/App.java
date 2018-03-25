package UDP_SERVER.UDP_SERVER;

/**
 * Hello world!
 *
 */
import java.io.*; 
import java.net.*; 

public class App 
{
    public static void main( String[] args )
    {
    	 try
         {
             DatagramSocket socket = new DatagramSocket(9090);
             byte[] receiveData = new byte[1024];             
             byte[] sendData = new byte[1024];
             while(true)
             {
                 DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                 socket.receive(receivePacket);
                 String sentence = new String(receivePacket.getData());
                 System.out.println("RECEIVED " + sentence);
                 String stringData = "hello client!";
                 sendData = stringData.getBytes();
                 InetAddress clientIpAddress = receivePacket.getAddress();
                 int clientPort = receivePacket.getPort();
                 DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientIpAddress, clientPort);
                 socket.send(sendPacket);
             }
         }       
         catch(Exception e)
         {
            System.out.println(e.toString());     
         }
            }
}
