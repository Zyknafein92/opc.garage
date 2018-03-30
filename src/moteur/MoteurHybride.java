package moteur;

import opc.garage.Moteur;

public class MoteurHybride extends Moteur{

	public MoteurHybride(String cylindre, double prix) {
		super(cylindre, prix);
		 this.setType(TypeMoteur.HYBRIDE);
	}

}
