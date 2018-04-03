package moteur;
import opc.garage.*;

public class MoteurEssence extends Moteur {

	public MoteurEssence(String cylindre, double prix) {
		super(cylindre, prix);
		 this.setType(TypeMoteur.ESSENCE);
	}



	
	
}


