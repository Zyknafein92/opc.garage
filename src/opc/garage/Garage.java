package opc.garage;
import java.util.ArrayList;
import java.util.List;

public class Garage 
{
	List<Vehicule> voitures =  new ArrayList<Vehicule>();

	
	public void addVoiture(Vehicule voit){

		// On ajoute une voiture
		voitures.add(voit);
		for(int i = 0; i < voitures.size(); i++)
	    System.out.println(voitures.get(i));
		
	}	


	public String toString(){

		String str = "";      
		str += "***************************\n";
		str += "*  Garage OpenClassrooms  *\n";
		str += "***************************";
		 
     
      return str;
      
	}
}


