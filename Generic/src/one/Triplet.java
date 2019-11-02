package one;

public class Triplet<T,T2> extends Couple<T>{
	//sois je garde le meme type de couple generosity que j'ai herité ou 
	//je garde Triplet class herite le meme en faisant Triplet<T> 
	//ou ajouter un autre type pour la class Triplet<T,T2> 
	
	private T2 c;
	
	public Triplet() {
		
	}
 
	

	public Triplet(T a, T b, T2 c) {
		super(a, b);
		this.c = c;
	}



	public T2 getC() {
		return c;
	}

	public void setC(T2 c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Triplet [c=" + c + "]";
	}
	
 
	

}
