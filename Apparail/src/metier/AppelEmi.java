package metier;

import java.util.Date;

public class AppelEmi extends Appel{

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return dureeAppel*2;
	}

	public AppelEmi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppelEmi(int numero, Date dataAppel, double dureeAppel) {
		super(numero, dataAppel, dureeAppel);
		// TODO Auto-generated constructor stub
	}
	
	

}
