package vehicule;

import opc.garage.Vehicule;


public class A300B extends Vehicule{

	public A300B(){
	}

	public A300B(String nomMarque, String Nom, double prix){
		this.setNomMarque(Marque.PIGEOT);
		this.setNom("A300B");
	}

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return 28457.0;
	}


}
