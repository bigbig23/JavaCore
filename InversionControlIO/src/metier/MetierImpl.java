package metier;

import dao.DaoImpl;
import dao.IDao;

public class MetierImpl implements IMetier {
 
	private IDao idao;
	
	@Override
	public double calcul() {
		double t = idao.getTemperature();
		return t;
	}

	public void setIdao(IDao idao) {
		this.idao = idao;
	}

	
	
}
