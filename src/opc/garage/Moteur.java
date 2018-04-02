package opc.garage;

import moteur.TypeMoteur;



public class Moteur {

	protected TypeMoteur type;
	protected String cylindre;
	protected double prix;


	// Getters
	public TypeMoteur getType() {
		return type;
	}

	public String getCylindre() {
		return cylindre;
	}

	public double getprix() {
		return prix;
	}

	// Setters

	public void setType(TypeMoteur type) {
		this.type.set(type);
	}

	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}

	public Moteur(String cylindre, double prix) {
		this.cylindre = getCylindre();
		this.prix = getprix();

	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public String toString(){
		return this.getType() + " " + this.getCylindre() + " (" + this.getprix()  + "€) " ;
	}

	
}



