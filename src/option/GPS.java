package option;

public class GPS  {

	public Double getPrixO() {

		return 113.5;
	}

	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrixO() + "€)";
	}
}