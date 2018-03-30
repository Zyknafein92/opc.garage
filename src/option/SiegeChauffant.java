package option;

public class SiegeChauffant {
	
	public Double getPrixO() {

		return 562.9;
	}

	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrixO() + "€)";
	}
}