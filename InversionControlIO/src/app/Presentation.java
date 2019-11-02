package app;
 
import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {

	public static void main(String[] args) {
		
		DaoImpl dao = new DaoImpl();
		MetierImpl metier = new MetierImpl();
		metier.setIdao(dao);//this is inversion of control IC
		System.out.println(metier.calcul());
		
		//but there is a better way using ic with a file, let's try it in app2

	}

}
