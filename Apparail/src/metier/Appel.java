package metier;

import java.util.Date;

public abstract class Appel {
	protected int numero;
	protected Date dataAppel;
	protected double dureeAppel;
	protected Contact contact;//un appel concern un contact
	
	//pour chaque appel on a besion de connaitre le cout
	public abstract double cout();
	
	public Appel() {
		
	}

	public Appel(int numero, Date dataAppel, double dureeAppel) {
		super();
		this.numero = numero;
		this.dataAppel = dataAppel;
		this.dureeAppel = dureeAppel;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDataAppel() {
		return dataAppel;
	}

	public void setDataAppel(Date dataAppel) {
		this.dataAppel = dataAppel;
	}

	public double getDuree() {
		return dureeAppel;
	}

	public void setDuree(double duree) {
		this.dureeAppel = duree;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	

	
}
