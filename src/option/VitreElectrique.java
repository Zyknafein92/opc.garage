package option;

public class VitreElectrique implements Option {

	public double getPrix() {

		return 212.35;
	}

	public String toString(){
		return "Vitre électrique " + "(" +this.getPrix() +"€)";
	}


}