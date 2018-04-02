package option;

public class BarreDeToit implements Option{

	public double getPrixO() {

		return 29.9;
	}

	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrixO() + "€)";
	}


}