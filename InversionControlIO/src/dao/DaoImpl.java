package dao;

public class DaoImpl implements IDao{

	@Override
	public double getTemperature() {
		// suppose we got t form db
		double t =24;
		
		return t;
	}

}
