package one;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) throws IOException {
		 
		File f1 = new File("notes.txt");
		FileReader fr = new FileReader(f1);
		
		File f2 = new File("copy.txt");
		FileWriter fw = new FileWriter(f2);
		
		int c;
		while((c=fr.read())!=-1) {
			fw.write(c);
			//System.out.println(c);
		}
		fw.close();
		fr.close();
		
		
	 
	}

}
