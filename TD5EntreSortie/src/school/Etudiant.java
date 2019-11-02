package school;

import java.io.Serializable;

public class Etudiant implements Serializable{
	
	private String code;
	private String matier;
	private transient float note; //transient which mean we don't want to save it	
	
	public Etudiant() {
		
	}

	public Etudiant(String code, String matier, float note) {
		super();
		this.code = code;
		this.matier = matier;
		this.note = note;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMatier() {
		return matier;
	}

	public void setMatier(String matier) {
		this.matier = matier;
	}

	public float getNote() {
		return note;
	}

	public void setNote(float note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Etudiant [code=" + code + ", matier=" + matier + ", note=" + note + "]";
	}
	
	
	

}
