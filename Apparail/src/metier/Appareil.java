package metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Appareil implements IAppareil{

	private List<Contact> contacts = new ArrayList<>();
	private Map<Integer, Appel> appels = new HashMap<Integer, Appel>();
	
	@Override
	public void enregistrerContact(Contact c) {
		contacts.add(c);
	}

	@Override
	public void enregistrerAppel(Appel a, String numeroTel) {
		Contact c1= null;
		for(Contact c:contacts) {
			if(c.getNumeroTel().equals(numeroTel)) {
				c1 = c;
				break;
			}
		}
		a.setContact(c1);
		appels.put(a.getNumero(), a);	
	}

	@Override
	public Contact consulterContact(int numContact) throws Exception {
		for(Contact c:contacts) {
			if(c.getNumero()==numContact) {
				return c;
			}
		}
		throw new Exception("Contact "+numContact+" introuvable");
	}

	@Override
	public List<Contact> consulterListContact(String mc) {
		List<Contact> conts = new ArrayList<>();
		for(Contact c: contacts) {
			if(c.getNom().contains(mc)) {
				conts.add(c);
			}
		}
		return conts;
	}
	
	
	@Override
	public double coutTotalAppels() {
		double total=0;
		for(Appel a:appels.values()) {
			total = total+a.cout();
		}
 		return total;
	}

	@Override
	public double coutAppels(Date d1, Date d2) {
		 //getTime() it converts the Date() on milisencond which enables to make comparisation btwn Date, it 
		//transfer Date on day,month,year
		double total =0;
		for(Appel a:appels.values()) {
			if((a.getDataAppel().getTime()>=d1.getTime())&&(a.getDataAppel().getTime()<=d2.getTime())) {
				total =total+a.cout();
			}
		}
		return total;
	}

	@Override
	public double coutAppelAvecNumCon(int numContact) {
		 double total=0;
		 for(Appel a:appels.values()) {
			 if(a.getContact().getNumero()==numContact) {
				 total+=a.cout();
			 }
		 }
		return total;
	}

}
