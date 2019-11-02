package metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class App1 {

	public static void main(String[] args) throws ParseException {
 
		IAppareil appareil = new Appareil();
		appareil.enregistrerContact(new Contact(1, "C1", "06686769"));
		appareil.enregistrerContact(new Contact(2, "C2", "06683333"));
		appareil.enregistrerAppel(new AppelEmi(1, new Date(), 55), "06686769");
		appareil.enregistrerAppel(new AppelEmi(2, new Date(), 77), "06686769");
		appareil.enregistrerAppel(new AppelEmi(3, new Date(), 46), "06683333");
		appareil.enregistrerAppel(new AppelRecu(4, new Date(), 88), "06683333");
		System.out.println("...........");
		System.out.println("Consulter un contact en sachant son numero");
		
		try {
			
			Contact c = appareil.consulterContact(1);
			System.out.println("Nom: "+c.getNumero());
			System.out.println("Nom: "+c.getNom());
			System.out.println("Nom: "+c.getNumeroTel());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("...........");
		System.out.println("Consulter les contact par un mot cle:");
		List<Contact> contacts = appareil.consulterListContact("C");
		for(Contact c:contacts) {
			System.out.println("..........");
			System.out.println("Nom: "+c.getNom());
			System.out.println("Nom: "+c.getNumeroTel());
	
		}
		System.out.println("....");
		System.out.println("consulter les cout total des  appels");
		System.out.println("Cout total "+appareil.coutTotalAppels());
		
		System.out.println("....");
		System.out.println("consulter le cout appels d'un contact");
		System.out.println("Cout total "+appareil.coutAppelAvecNumCon(1));
		
		System.out.println("............");
		System.out.println("consulter le cout appels entre deux dates");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse("10/10/2019");
		Date d2 = sdf.parse("18/10/2019");
		System.out.println("Cout total "+appareil.coutAppels(d1, d2));
		
		
	}

}
