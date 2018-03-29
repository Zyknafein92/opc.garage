package option;

public class Climatisation implements Option{

	public Double getPrix() {

		return 113.5d;
	}

	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrix() + "€)";
	}
}