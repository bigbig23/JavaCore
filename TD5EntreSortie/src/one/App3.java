package one;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class App3 {

	public static void main(String[] args) throws Exception {
		 
		File f1 = new File("notes.txt");
		FileReader fr = new FileReader(f1);
		
		BufferedReader br = new BufferedReader(fr);
		
		String s; int nb=0; float somme= 0;
		while((s=br.readLine())!=null) {
			nb++;
			String[] sp = s.split(";");
			//System.out.println(sp[2]); //this shows only the notes
			float note = Float.parseFloat(sp[2]);
			somme+=note;
		}
		
		System.out.println("nb: "+nb);
		System.out.println("nb: "+somme);
		System.out.println("Moyenne: "+somme/nb);
		
		
	}

}
