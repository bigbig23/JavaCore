package metier;

import java.util.Date;
import java.util.List;

public interface IAppareil {
	public void enregistrerContact(Contact c);
	public void enregistrerAppel(Appel a,String numeroTel);
	public Contact consulterContact(int numContact) throws Exception; //in case when numContact does not exist
	public List<Contact> consulterListContact(String mc);
	public double coutTotalAppels();
	public double coutAppels(Date d1,Date d2);
	public double coutAppelAvecNumCon(int numContact);
	
	
	
	

}
