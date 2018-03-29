package option;

public class VitreElectrique {


	public Double getPrix() {

		return 212.35;
	}

	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrix() + "€)";

	}
}