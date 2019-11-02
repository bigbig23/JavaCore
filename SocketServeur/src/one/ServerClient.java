package one;

import java.io.BufferedReader;
import java.io.*;
import java.net.Socket;

public class ServerClient extends Thread{
	//un serveur mulit thread qui accept plusier client
	
	//we 2 variable
	//client number and Socket which represent the client
	private int numero;
	private Socket client;
	public ServerClient(int numero, Socket client) {
		super();
		this.numero = numero;
		this.client = client;
	}
	
	@Override
	public void run() {
		 try {
			InputStream is = client.getInputStream();
			//pour lire un chain de charater
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			//pour envoyer un chain de charectere
			OutputStream os = client.getOutputStream();
			PrintWriter pw = new PrintWriter(os,true);
			//show message when the client connect
			System.out.println("Connexio du client numero : "+numero);
			pw.println("Connexio du client numero : "+numero);
			
			while(true) {
				//ls Serveur il attend le client envoie un chain du chareter
				String  req = br.readLine();
				//le serveur reponds avec
				pw.println(req.length());
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
