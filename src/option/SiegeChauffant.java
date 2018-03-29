package option;

public class SiegeChauffant {
	public Double getPrix() {
		// TODO Auto-generated method stub
		return 562.9;
	}

	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrix() + "€)";
	}
}