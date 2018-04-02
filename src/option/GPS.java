package option;

public class GPS implements Option {

	public double getPrixO() {

		return 113.5;
	}

	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrixO() + "€)";
	}
}