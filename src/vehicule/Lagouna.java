package vehicule;

import opc.garage.Vehicule;


public  class Lagouna extends Vehicule {
	
	public Lagouna() {
		
	}

	public Lagouna(String nomMarque, String Nom, double prix){
		this.setNomMarque(Marque.RENO);
		this.setNom("Lagouna");
	}

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return 23123.0;
	}

}
