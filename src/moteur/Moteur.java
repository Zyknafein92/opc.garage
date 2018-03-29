package moteur;

import moteur.TypeMoteur;
import opc.garage.Vehicule;

public abstract class Moteur extends Vehicule {

	protected TypeMoteur type;
	protected String cylindre;
	protected double prixm;

	// Constructeur s P
	public Moteur()
	{
		type = null;
		cylindre = "Inconnu";
		prixm = 0.0;
	}
	
// Méthode
	public void Moteur (String Cylindre, double Prixm)
	{
		this.cylindre = Cylindre;
		this.prixm = Prixm;
	}

	//Getters

	public TypeMoteur getType() {
		return type;
	}

	public String getCylindre() {
		return cylindre;
	}

	public double getPrixm() {
		return prixm;
	}

	//Setters

	public void setType(TypeMoteur type) {
		this.type = type;
	}

	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}

	public void setPrixm(double prixm) {
		this.prixm = prixm;
	}

}