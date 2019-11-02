package school;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class App6 {

	public static void main(String[] args) throws Exception {
 
		File f = new File("eco.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Etudiant e1 = (Etudiant) ois.readObject();
		Etudiant e2 = (Etudiant) ois.readObject();
		

		System.out.println(e1);
		System.out.println(e2);

		//note is o bcoz it's under tranisent, which menas we don't want to save it
		

		
	}

}
