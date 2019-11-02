package one;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.*;

public class ServerMulti extends Thread{
	//it must override run method for Thread
	private int nbclients;
	@Override
	public void run() {
 		try {
			ServerSocket ss = new ServerSocket(456);
			
			while(true) {
				Socket s = ss.accept();
				nbclients++;
				new ServerClient(nbclients, s).start();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// must start the thread
		new ServerMulti().start();

	}

}
