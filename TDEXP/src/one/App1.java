package one;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		System.out.println("A:");
		int a = clavier.nextInt();
		System.out.println("B:");
		int b = clavier.nextInt();
		int c = a/b;
		//when dividing by zero , try catch execption must be used
		System.out.println("C:"+c);
		
	}

}
