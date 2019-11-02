package one;

import java.util.Date;

public class App2 {

	public static void main(String[] args) {

		Triplet<String, Double> o = new Triplet<String, Double>("A", "B", 8.3);
		System.out.println(o.getA());
		System.out.println(o.getB());
		System.out.println(o.getC());

		//we use Genereric bcoz we use different type with same class
		Triplet<Date, Float> o2 = new Triplet<Date, Float>(new Date(), new Date(), 4.4f);
		System.out.println(o2.getA());
		System.out.println(o2.getB());
		System.out.println(o2.getC());
		
		
		
	}

}
