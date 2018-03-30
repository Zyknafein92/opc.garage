package option;

public class VitreElectrique {

	public Double getPrixO() {

		return 212.35;
	}

	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrixO() + "€)";
	}


}