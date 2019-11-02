package one;

public class Couple<T> {
	// T it means when we don't know the type
	private T a;
	private T b;
	
	public Couple() {
		
	}

	public Couple(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Couple [a=" + a + ", b=" + b + "]";
	}
	
	

}
