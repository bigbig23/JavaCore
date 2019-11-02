package one;

import java.io.File;

public class App1 {

	public static void main(String[] args) {

		//to show all directory in ur file
		File file = new File("/home/raed/Desktop/angularCrudeJava/POOJavaClasseObjet");
		String[] contain = file.list();
		for(String s:contain) {
			System.out.println(s);
		}
		
		//another way
		File f1 = new File("/home/raed/Desktop/angularCrudeJava/POOJavaClasseObjet");
		String[] co = file.list();
		for(String s:contain) {
			File f2 = new File("/home/raed/Desktop/angularCrudeJava"+s);
			if(f2.isDirectory()) {
				System.out.println("Rep"+ f2);
			}
			
		}
		
		
		
		
		
		
	}

}
