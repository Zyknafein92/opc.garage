package moteur;

import opc.garage.Moteur;

public  class MoteurDiesel extends Moteur{

	public MoteurDiesel(String cylindre, double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.DIESEL);
	}

}


