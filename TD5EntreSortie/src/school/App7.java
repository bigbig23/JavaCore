package school;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

public class App7 {

	public static void main(String[] args) throws Exception {
		// let's seriliaze in byte table using ArrayByteOutputStream()
		
 
		Etudiant e1 = new Etudiant("E1","Physic",12);
		Etudiant e2 = new Etudiant("E2","Physic",11);
		Etudiant e3 = new Etudiant("E3","Physic",14);

		//File f = new File("eco.txt");
		//FileOutputStream fos = new FileOutputStream(f);
		ByteArrayOutputStream fos = new ByteArrayOutputStream(); //serilize inot a Byte table 
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(e1);
		os.writeObject(e2);
		os.writeObject(e3);
		
		byte[] t = fos.toByteArray();
		System.out.println(t.length);
		
		os.close();

	}

}
