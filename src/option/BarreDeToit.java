package option;

public class BarreDeToit implements Option {

	@Override
	public Double getPrix() {

		return 29.9;
	}
	public String toString()
	{
		return this.getClass().getSimpleName() + " (" + this.getPrix() + "€)";

	}
}