package opc.garage;



import moteur.TypeMoteur;





public class Moteur extends Vehicule {


	protected TypeMoteur type;
	protected String cylindre;
	protected double Prix;

	// Constructeur 
	
	public Moteur(String cylindre, double Prix) {
		this.cylindre = cylindre;
		this.prix = getPrix();

	}
	

			
	
	// Getters
	public TypeMoteur getType() {
		return type;
	}

	public double getPrix() {
		return prix;
	}


	public String getCylindre() {
		return cylindre;
	}


	// Setters

	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}

	public void setPrix(double Prix) {
		this.prix = Prix;
	}


		public String toString()
	    {	
	    
	    return type + getCylindre();
        }

	public void setType(TypeMoteur type) {
		this.type = type;
	}

	
}



