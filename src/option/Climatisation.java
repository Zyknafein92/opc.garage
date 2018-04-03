package option;

public class Climatisation implements Option {

	public double getPrixO() {

		return 347.3;
	}

	public String toString(){
		return "Climatisation " + " (" + this.getPrixO() + "€)";
	}
}