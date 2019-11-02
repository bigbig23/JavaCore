package one;

import java.io.*;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) {
 
		//this code represents the server part
		try {
			ServerSocket ss = new ServerSocket(234);
			System.out.println("j'attend une conexion");
			Socket s = ss.accept();
			InputStream is = s.getInputStream(); //to have more space it's better using InputBufferedReader() and so on 
			OutputStream os = s.getOutputStream();
			System.out.println("j'atend un nombre");
			int nb = is.read(); //lire la reponse
			int rep = nb*3;
			os.write(rep); //envoyer la reponse
			
			//s.close(); to disconect client but i want keep it 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
