package opc.garage;

import moteur.TypeMoteur;



public class Moteur extends Vehicule{

	protected TypeMoteur type;
	protected String cylindre;
	


	// Getters
	public TypeMoteur getType() {
		return type;
	}

	public String getCylindre() {
		return cylindre;
	}


	

	// Setters

	public void setType(TypeMoteur type) {
		this.type = type;
	}

	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}

	public Moteur(String cylindre, double prix) {
		this.cylindre = getCylindre();
		this.prix = getPrix();

	}


	public String toString(){
		return this.getType() + " " + this.getCylindre() + " (" + this.getPrix()  + "€) " ;
	}

}



