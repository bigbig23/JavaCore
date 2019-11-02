package school;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class App5 {

	public static void main(String[] args) throws Exception {
 
		//here we serliaze into a file
		
		Etudiant e1 = new Etudiant("E1","Physic",12);
		Etudiant e2 = new Etudiant("E2","Physic",11);
		Etudiant e3 = new Etudiant("E3","Physic",14);

		File f = new File("eco.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(e1);
		os.writeObject(e2);
		os.writeObject(e3);
		os.close();
		
	}

}
