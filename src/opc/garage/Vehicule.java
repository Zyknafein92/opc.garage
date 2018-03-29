package opc.garage;

import java.util.ArrayList;
import option.*;
import java.util.List;

import vehicule.Marque;

public abstract class Vehicule extends Garage {

	private double prix;
	private String nom;
	private List<Option> options =  new ArrayList<Option>();
	private Marque nomMarque;

	// Constructeur par défault de Véhicule

	public Vehicule(){
		prix = 0.00;
		nom = "Inconnu";
		nomMarque = null;
		options = new ArrayList<Option>();

	}
	// Constructeur avec P

	public Vehicule(Double pPrix, String pNom,Marque pNomMarque,List<Option> pOptions )
	{ 

		this.prix = pPrix;
		this.nom = pNom;
		this.nomMarque = pNomMarque;   
		this.options =  new ArrayList<Option>(pOptions);
	}
	// ------------------- GET

	public  double getPrix(){
		return this.prix;
	}

	public Marque getMarque(){
		return this.nomMarque;
	}

    public String getNom(){
		return this.nom;
	}

	public  List<Option> getOption(){
		return this.options;
	}

	// ------------------- SET

	public void setMarque(Marque pMarque){
		this.nomMarque = pMarque;
	}

	public void setNom(String pNom){
		this.nom = pNom;
	}

	public void setPrix(double pPrix){
		this.prix = pPrix;
	}

	 public void addOption (Option opt)
	    {
	        Option.add(opt);
	    }
	}
