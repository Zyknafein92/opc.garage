package vehicule;

import opc.garage.Vehicule;




public  class A300B extends Vehicule {

	public A300B(){
		super();
		this.setNomMarque(Marque.PIGEOT);
		this.setNom("A300B");
	}
	
	public double getPrix() {
		// TODO Auto-generated method stub
		return 28457.0;
	}

	@Override
	public double getPrixO() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
