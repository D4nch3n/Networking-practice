import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args)
	{
		String address = "localhost"; // ip address of device you're connecting to
		try {
		ServerSocket server = new ServerSocket(5555);
		System.out.println("Server starting....");
		Socket connect = server.accept(); // waits for client to connect to server
		System.out.println("CLIENT CONNECTED");
		server.close();
		connect.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
