package two;

import java.util.Date;

public class App4 {

	public static void main(String[] args) {
 
		//must Produit comme parametter and Produit must implement Serializable and Clonable 
		Traitment<Produit>  t = new Traitment<>();
		
		//ProduitLiquid must extends the class Produit
		Traitment<ProduitLiquid>  pl = new Traitment<>();
		
		Traitment<Produit>  tt = new Traitment<>(new ProduitLiquid(),new ProduitLiquid());
		
		
		System.out.println(pl.getA());
	}

}
