
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;


//Also found this at http://www.rgagnon.com/javadetails/java-0542.html
public class Receiver {

  public final static int SOCKET_PORT = 1000;      
  public static String SERVER = "";
  public static String FILE_TO_RECEIVE = "";  

  public final static int FILE_SIZE = 6022386; //just an arbitrary, decently large number at around 6 megabytes

  public static void main (String [] args ) throws IOException {
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter the IP address of the sender: ");
	SERVER = input.next();
	System.out.print("Please enter just the name of the file expected (including file type) : ");
	FILE_TO_RECEIVE = "/received/" + input.next();
	input.close();
	
    int bytesRead;
    int current = 0;
    FileOutputStream fos = null;
    BufferedOutputStream bos = null;
    Socket sock = null;
    try {
      sock = new Socket(SERVER, SOCKET_PORT);
      System.out.println("Connecting...");

      // receive file
      byte [] mybytearray  = new byte [FILE_SIZE];
      InputStream is = sock.getInputStream();
      fos = new FileOutputStream(FILE_TO_RECEIVE);
      bos = new BufferedOutputStream(fos);
      bytesRead = is.read(mybytearray,0,mybytearray.length);
      current = bytesRead;

      do {
         bytesRead =
            is.read(mybytearray, current, (mybytearray.length-current));
         if(bytesRead >= 0) current += bytesRead;
      } while(bytesRead > -1);

      bos.write(mybytearray, 0 , current);
      bos.flush();
      System.out.println("File " + FILE_TO_RECEIVE
          + " downloaded (" + current + " bytes read)");
    }
    finally {
      if (fos != null) fos.close();
      if (bos != null) bos.close();
      if (sock != null) sock.close();
    }
  }

}