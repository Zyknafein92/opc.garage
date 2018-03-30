package opc.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage 
{
List<Vehicule> voitures =  new ArrayList<Vehicule>();

public void addVoiture(Vehicule voit){
    
    // On ajoute une voiture
    voitures.add(voit);
}
}
