import java.io.*;
import java.net.*;

public class ServerSide      // press Ctrl-C to terminate this program
{
public static void main (String[] args)
     {
     try {
         System.out.println("Press ctrl - c to terminate this program.");
		 ServerSocket ss = new ServerSocket(3250); // specify port number.
         System.out.println("Server listening at " +
                             InetAddress.getLocalHost() +
                             " on port " + ss.getLocalPort());
         while (true)
             {
             Socket          s       = ss.accept();//wait for new client to call
             DataInputStream dis     = new DataInputStream(s.getInputStream());
             String          message = dis.readUTF();// wait for client to send
             System.out.println(message);
             }                           
         }                                 
     catch(Exception e)
         {
         System.out.println(e);
         }
     }   
}   
