import java.io.IOException;

public class GetServerMessage implements Runnable{	
	
	public static void main(String[] args) {
				
		try {
			System.out.println("Program start!");
			
			//Thread possibleThread = new Thread(new ServerTest());
			//possibleThread.start();
			
			//setting up a client, connect to server and send a message to the server
			Client client = new Client("192.168.1.107", 60166);
			client.sendMsgToServer("Hello Server, my friend!!");
			System.out.println("Message send to Server");
			
			//get and print the recieved message from the server  					
			
			//shut down the client and server and server Thread 
			client.closeServerConnection();
			
			//possibleThread.stop();
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}
	
	// not in use, itended for possible threads
	public void run() {
		
	}

}
