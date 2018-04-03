package option;

public class VitreElectrique implements Option {

	public double getPrixO() {

		return 212.35;
	}

	public String toString(){
		return "Vitre électrique " + " (" + this.getPrixO() + "€)";
	}


}