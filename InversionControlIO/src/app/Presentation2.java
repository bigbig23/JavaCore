package app;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class Presentation2 {

	public static void main(String[] args) {
		 
		//using scanner to read file
		try {
			Scanner clavier = new Scanner(new File("config.txt"));
			String daoClassName = clavier.next();
			String metierClassName = clavier.next();
			//System.out.println(daoClassName);
			//mtnt on va charger notre Class de memoire
			Class cDao = Class.forName(daoClassName);
			Class cMetier = Class.forName(metierClassName);
			//System.out.println(cDao);
			IDao dao = (IDao) cDao.newInstance(); //permer de creer un object 
 			IMetier metier= (IMetier) cMetier.newInstance();
			//System.out.println(dao.getTemperature());
			
			//now let;s inject metier.setDao(dao); with Method method
			Method m = cMetier.getMethod("setIdao", new Class[] {IDao.class});
			m.invoke(metier, new Object[] {dao});
			
			System.out.println(metier.calcul());
	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
