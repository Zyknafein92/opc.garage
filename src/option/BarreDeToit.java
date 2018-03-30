package option;

public class BarreDeToit {

	public double getPrixO() {

		return 29.9;
	}

	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrixO() + "€)";
	}


}