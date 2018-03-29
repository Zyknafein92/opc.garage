package option;

public class GPS {

	public Double getPrix() 
	{

		return 113.5;
	}
	public String toString()
	{
		return this.getClass().getSimpleName() + " (" + this.getPrix() + "€)";
	}
}