package option;

public class Climatisation implements Option {

	public double getPrixO() {

		return 347.3;
	}

	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrixO() + "€)";
	}
}