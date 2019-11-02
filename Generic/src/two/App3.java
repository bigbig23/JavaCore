package two;

public class App3 {

	public static void main(String[] args) {
 
		Calcul<String> c = new Calcul<>();
		double a = 9.1;
		double b = 9.2;
		System.out.println(c.comparer(a, b));
		
		String x="monay";
		String y = "monay";
		System.out.println(c.comparer(x, y));
	}

}
