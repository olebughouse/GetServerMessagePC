import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	private String serverAdress;
	private int serverPort;
	private Socket socket;
		
	public Client(String serverAdress, int serverPort) throws IOException {
		this.serverAdress = serverAdress;
		this.serverPort = serverPort;
		
		Socket socket = new Socket(serverAdress, serverPort);
		this.socket = socket;
	}
	
	public void sendMsgToServer(String msg) throws IOException {
		
		// implements reader and writer connection to the server socket
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(
	        new InputStreamReader(socket.getInputStream()));
		
		//send message to Server
		out.println(msg);		
	}
	
	public void closeServerConnection() throws IOException {
		socket.close();
	}
	
	//----------------------------------------------
	//
	//		getter and setter methods
	//
	//---------------------------------------------		
	
	public String getServerAdress() {
		return this.serverAdress;
	}
		
	public int getServerPort() {
		return this.serverPort;
	}
	
	public Socket getClientSocket() {
		return this.socket;
	}
	
	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}
	
	public void setServerAdress(String serverAdress) {
		this.serverAdress = serverAdress;
	}
	
	public Socket getServerSocket() {
		return this.socket;
	}
}
