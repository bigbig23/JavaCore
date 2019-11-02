package two;

import java.io.Serializable;

public class Traitment <T extends Produit & Serializable & Cloneable>{
	//Traitement recois un type generic T qui est uniquement de type Produit
	//ce type est aussi Seriliazable and clonables
	
	//to initialize Traitment, produit must implement Serializable and Clonable
	
	private T a;
	private T b;
	
	public Traitment() {
		
	}

	public Traitment(T a, T b) {
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
	
	

}
