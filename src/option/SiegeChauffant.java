package option;

public class SiegeChauffant implements Option {
	
	public double getPrixO() {

		return 562.9;
	}

	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrixO() + "€)";
	}
}