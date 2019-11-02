package demo.one;

public class AppTd1 {

	public static void main(String[] args) {
		
		Compte c1 = new Compte(1,5000);
		c1.verser(60);
		c1.retirer(10);
		System.out.println(c1);
		
	}
}
