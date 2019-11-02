package one;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// Cient side
		
		try {
			Socket s = new Socket("localhost",234);
 			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			Scanner clavier = new Scanner(System.in);
			System.out.println("Donner un nombre: ");
			int nb = clavier.nextInt();
			os.write(nb);//envoyer la reponse
			int rep = is.read(); //lire la reponse
			System.out.println("Rep: "+rep);
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
