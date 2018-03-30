package option;

public class Climatisation {

	public Double getPrixO() {

		return 347.3;
	}

	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrixO() + "€)";
	}
}